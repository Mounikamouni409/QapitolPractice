package com.qaptiol.base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	
	
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws IOException {
		
		FileReader file = new FileReader("C:\\Users\\Qapitol QA\\eclipse-workspace\\Qapitol\\src\\test\\resources\\TestData.properties");
		Properties props = new Properties();
		props.load(file);
		
		
		driver = new ChromeDriver();
		driver.get(props.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	/*@AfterClass
	public void closeBrowser() {
		driver.quit();
	}*/

}
