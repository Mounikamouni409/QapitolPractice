package com.restassuredframework.testcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.core.util.FileUtils;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;

import com.restassuredframework.endpoints.UserEndpoints;
import com.restassuredframework.payload.User;
import com.restassuredframework.utility.ExtentReportManager;

import io.restassured.response.Response;

@Listeners(ExtentReportManager.class)
public class UserTest {
	
	User user;
	Faker faker;
	
	
	@DataProvider(name = "scenario1")
	public Object[] getData() {
		
		ObjectMapper mapper = new ObjectMapper();
		
		File file = new File("C:\\Users\\Qapitol QA\\eclipse-workspace\\RestAssuredFramework\\src\\test\\resources\\Scenario.json");
		List<User> listOfUser = null ;
		try {
			listOfUser = mapper.readValue(file,new TypeReference<List<User>>() {});
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		int size = listOfUser.size();
		Object[] objects = new Object[size];
		
		for(int i=0; i<listOfUser.size(); i++ ) {
			objects[i] = listOfUser.get(i);
		}
		return objects;
	}
	
	@BeforeClass
	public void setup() throws StreamReadException, DatabindException, IOException {
		
//		user = new User();
		
		
//		System.out.println(listOfUser.toString());
		
//		user = listOfUser.get(0);
		
		faker = new Faker();
//		
//		
//		
//		user.setId(faker.idNumber().hashCode());
//		user.setFirstName(faker.name().firstName());
//		user.setLastName(faker.name().lastName());
//		user.setUsername(faker.name().username());
//		user.setEmail(faker.internet().emailAddress());
//		user.setPassword(faker.internet().password());
//		user.setUserStatus(faker.idNumber().hashCode());
		
		
	}
	
	@Test(priority = 1, dataProvider = "scenario1")
	public void verifyCreateUser(User user) {
		
//		for(int i =0;i<listOfUser.size(); i++) {
			
//			user = listOfUser.get(i);
			//System.out.println(user.getId());

			Response response = UserEndpoints.createUser(user);
			response.then().log().all();			
			Assert.assertEquals(response.getStatusCode(), 200);
//		}	
	}
	
	@Test(priority = 2 , dataProvider = "scenario1")
	public void verifyGetUserByUsername(User user) {
		
		Response response = UserEndpoints.getUserByUserName(user.getUsername());
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
		//Assert.assertEquals(response.getBody(), user);
		
	}
	
	@Test(priority = 3,dataProvider = "scenario1" )
	public void verifyUpdateUserByUsername(User user) {
		user = new User();
		user.setId(faker.idNumber().hashCode());
		user.setFirstName(faker.name().firstName());
		user.setLastName(faker.name().lastName());
		user.setUsername(faker.name().username());
		user.setEmail(faker.internet().emailAddress());
		user.setPassword(faker.internet().password());
		user.setUserStatus(faker.idNumber().hashCode());
		
		System.out.println("User Details "+user.toString());
		System.out.println("User Name "+user.getUsername());

		
		
		Response response = UserEndpoints.updateUsername(user, user.getUsername());
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	@Test(priority = 4, dataProvider = "scenario1")
	public void verifyDeleteUser(User user) {
		
		Response response = UserEndpoints.deleteUser(user.getUsername());
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	

}
