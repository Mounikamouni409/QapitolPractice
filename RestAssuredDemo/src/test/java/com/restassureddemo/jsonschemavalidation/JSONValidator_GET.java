package com.restassureddemo.jsonschemavalidation;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.testng.annotations.Test;

import com.restassureddemo.base.TestBase;

public class JSONValidator_GET extends TestBase{
	
	@Test
	public void validateJsonSchemaGet() {
		
		given()
			.get("/api/unknown")
		.then()
			.assertThat()
			.body(matchesJsonSchemaInClasspath("JSONGetSchema.json"))
		.and()
			.statusCode(200)
			.log().all();
		
	}

}
