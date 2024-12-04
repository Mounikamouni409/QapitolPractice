package workshop.WorkshopSelenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	
	@BeforeClass
	public void beforeClass() {

		System.out.println("I am Before class");
	}

	@AfterClass
	public void afterClass() {

		System.out.println("I am After class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am After Method");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am After suite");

	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am before suite");

	}
	
	@AfterTest
	public void afterTest() {

		System.out.println("I am After Test");

	}
	
	@BeforeTest
	public void beforeTest() {

		System.out.println("I am Before test");

	}

	@Test
	public void test() {

		System.out.println("I am test method1 ");

	}

	@Test
	public void test1() {

		System.out.println("I am test method 2");

	}
}
