package com.qapitol.guru99.base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class Baseclass {
	public static WebDriver driver;
	
	public Properties props;
	public Logger logger;

	@BeforeClass
	public void openBrowser(String browser) throws IOException {

		//logger = LogManager.getLogger(this.getClass()); // this is a class so dynamically get the class when run time

		FileReader file = new FileReader(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Config.properties");
		props = new Properties();
		props.load(file);
		
		driver = new ChromeDriver();
		driver.get(props.getProperty("url"));
		System.out.println("Title: " + driver.getTitle());
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		

	}

//	@AfterClass
	//public void closeBrowser() {
		//BaseTest.quitDriver();
		//driver.quit();
//	}

}
