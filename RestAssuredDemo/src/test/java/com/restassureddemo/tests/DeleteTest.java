package com.restassureddemo.tests;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import com.restassureddemo.base.TestBase;

public class DeleteTest extends TestBase{

	
	@Test
	public void deleteTest() {
		
		given()
			.delete("api/users/2")
		.then()
			.statusCode(204)
			.log().all();
		
	}
}
