package com.qapitol.base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public void openBrowser() throws IOException {
		
		FileReader file = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData.properties");
		Properties props = new Properties();
		props.load(file);
		
		if ("chrome".equalsIgnoreCase(props.getProperty("browser"))) {
            
            driver = new ChromeDriver();
        } 
		else if ("firefox".equalsIgnoreCase(props.getProperty("browser"))) {
            
            driver = new FirefoxDriver();
        } 
		else if("edge".equalsIgnoreCase(props.getProperty("browser"))){
			driver = new EdgeDriver();
			
		}
		else {
            throw new IllegalArgumentException("Unsupported browser: " + props.getProperty("browser"));
        }
		
		
		driver.get(props.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/*@AfterClass
	public void closeBrowser() {
		driver.quit();
	}*/
	
	

}
