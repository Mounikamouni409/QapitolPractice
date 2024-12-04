package com.guru99demo.base;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties props = new Properties();
	
	@BeforeClass
	public void openBrowser() throws Exception {
		
		FileReader file = new FileReader("C:\\Users\\Qapitol QA\\eclipse-workspace\\Guru99Demo\\src\\main\\resources\\Config.properties");
		
		props.load(file);
		
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
		
		//driver = new ChromeDriver();
		driver.get(props.getProperty("url"));
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("Title::"+ driver.getTitle());
		
		
	}
	
	/*@AfterClass
	public void closeBrowser() {
	
	if (driver != null) {
            driver.quit();
        }
		
	}*/

}
