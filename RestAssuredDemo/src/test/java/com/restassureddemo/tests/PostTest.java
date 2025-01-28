package com.restassureddemo.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import com.restassureddemo.base.TestBase;

import io.restassured.http.ContentType;

public class PostTest extends TestBase {

	@Test
	public void postTest() {
		//Map<String, Object> map = new HashMap<String, Object>();
		//map.put("name", "mounika");
		//map.put("job", "Tester");

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "Mounika");
		jsonObject.put("job", "Tester");
		
		given()
			.header("Content-Type","application/json")
			.contentType(ContentType.JSON).accept(ContentType.JSON)//request body and expected body both are in json format
			.body(jsonObject.toJSONString())
		.when()
			.post("/api/users")
		.then()
		.assertThat()
			.body("name", equalTo("Mounika"))
			.body("job", equalTo("Tester"))

			.statusCode(201)
			.log().all();

	}

}
