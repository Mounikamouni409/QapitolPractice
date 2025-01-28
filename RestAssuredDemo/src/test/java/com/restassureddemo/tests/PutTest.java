package com.restassureddemo.tests;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.restassureddemo.base.TestBase;

import io.restassured.http.ContentType;

public class PutTest extends TestBase{
	
	
	@Test
	public void putTest() {
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "Mounika");
		jsonObject.put("job", "Tester");
		
		given()
			.header("Content-Type","application/json")
			.contentType(ContentType.JSON).accept(ContentType.JSON)
			.body(jsonObject.toJSONString())
		.when()
			.put("api/users/2")
		.then()
			.assertThat()
			.body("name", equalTo("Mounika"))
			.body("job", equalTo("Tester"))
		.and()
			.statusCode(200) // checks if the response code is 200
			.log().all();// Logs the response for debugging
		
	}

}
