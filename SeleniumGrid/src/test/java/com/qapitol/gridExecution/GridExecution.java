package com.qapitol.gridExecution;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridExecution {
	
	@Test
	public void Test1() {
		
		try {
			System.out.println("Test1 started...");
			DesiredCapabilities cap = new DesiredCapabilities();
			//cap.setBrowserName("chrome");
			cap.setBrowserName(Browser.CHROME.browserName());
			cap.setPlatform(Platform.WIN11);
			
			@SuppressWarnings("deprecation")
			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.2.99:4444/"), cap);
			
			driver.get("https://demoqa.com/");
			//driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			System.out.println("Test1 ended...");
			driver.quit();
			
		} catch (Exception e) {
			System.out.println("Exception is:"+e);
		}
	}
	
 
	@Test
	public void Test2() {
		
		try {
			System.out.println("Test2 started...");
			DesiredCapabilities cap = new DesiredCapabilities();
			
			//cap.setBrowserName("chrome");
			cap.setBrowserName(Browser.EDGE.browserName());
			cap.setPlatform(Platform.WIN11);
			
			@SuppressWarnings("deprecation")
			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.2.99:4444/"), cap);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(10000);
			System.out.println("Test2 ended...");
			driver.quit();
			
		} catch (Exception e) {
			System.out.println("Exception is:"+e);
		}
	}
	
	
	@Test
	public void Test3() {
		
		try {
			System.out.println("Test3 started...");
			DesiredCapabilities cap = new DesiredCapabilities();
			//cap.setBrowserName("chrome");
			cap.setBrowserName(Browser.CHROME.browserName());
			cap.setPlatform(Platform.WIN11);
			
			@SuppressWarnings("deprecation")
			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.2.99:4444"), cap);
			driver.manage().window().maximize();
			
			driver.get("https://www.browserstack.com/");
			//driver.get("https://www.google.com/");
			Thread.sleep(10000);
			System.out.println("Test3 ended...");
			driver.quit();
			
		} catch (Exception e) {
			System.out.println("Exception is:"+e);
		}
		
		
		/*if (TestData.get("executionEnv").equalsIgnoreCase("remote")) {    
			DesiredCapabilities capabilities = new DesiredCapabilities();    
			capabilities.setBrowserName(Browser.EDGE.browserName());    
			capabilities.setPlatform(Platform.WIN11);    
			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.2.11:4444/wd/hub"), capabilities);    
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
		logger.info("Chrome WebDriver started.");
		}*/
	}

}
