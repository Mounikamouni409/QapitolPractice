package com.restassureddemo.tests;


import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.restassureddemo.base.TestBase;

import io.restassured.response.Response;

public class RestAssuredTest extends TestBase{
	
	//@Test
	public void getData() {
		
	Response response = given().get("https://reqres.in/api/users?page=2");
	
	Assert.assertEquals(response.statusCode(), 200);
	System.out.println(response.asPrettyString());
		
	}
	
	//@Test
	
	public void validateGetData() {
		baseURI = "https://reqres.in";
		
		given().get("/api/users?page=2")
		.then()
			.body("data[1].first_name", equalTo("Lindsay"));
		
		
		
		
	}
	
	@Test
	public void validateMultipleArrayData() {
		
		given().get("/api/users?page=2")
		.then()
			.body("data.first_name", hasItems("Lindsay","Tobias"))
			.statusCode(200)
			.log().all();
		
		
	}
	
	
	
}
