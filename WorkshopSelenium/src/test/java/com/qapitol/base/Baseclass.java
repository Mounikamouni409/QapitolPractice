package com.qapitol.base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public void openBrowser() throws IOException {
		
		FileReader file = new FileReader("C:\\Users\\Qapitol QA\\eclipse-workspace\\WorkshopSelenium\\src\\test\\resources\\TestData.properties");
		Properties props = new Properties();
		props.load(file);
		
		driver = new ChromeDriver();
		//driver.get("https://www.cricbuzz.com/cricket-series/8525/womens-big-bash-league-2024/points-table");
		driver.get(props.getProperty("url1"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
