package com.restassureddemo.base;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import static io.restassured.RestAssured.*;

public class TestBase {
	
	@BeforeClass
	public void preRequistics() {
		
		baseURI = "https://reqres.in";
	}

}
