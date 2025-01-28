package com.restassuredframework.endpoints;

import static io.restassured.RestAssured.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.restassuredframework.payload.User;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndpoints {
	
	public static Logger logger = LogManager.getLogger(UserEndpoints.class);
	
	public static Response createUser(User userPayload){
		
		logger.debug("Started creating User API");
		Response response =  given()
			.header("Content-Type", "application/json")
			.contentType(ContentType.JSON).accept(ContentType.JSON)
			.body(userPayload)
		.when()
			.post(Routes.post_url);
		
		logger.debug("Ended creating User API");
		
		return response;
		
	}
	
	public static Response getUserByUserName(String username){
		
		Response response =  given()
								.pathParam("username", username)
							.when()
								.get(Routes.get_url);
		
		return response;
		
	}
	
	public static Response updateUsername(User userPayload, String username){
		
		Response response =  given()
			.pathParam("username", username)
			.header("Content-Type", "application/json")
			.contentType(ContentType.JSON).accept(ContentType.JSON)
			.body(userPayload)
		.when()
			.put(Routes.put_url);
		
		return response;
		
	}
	
	
	public static Response deleteUser(String username){
		
		Response response =  given()
				.pathParam("username", username)
			.when()
				.delete(Routes.delete_url);

		return response;
		
	}

}
