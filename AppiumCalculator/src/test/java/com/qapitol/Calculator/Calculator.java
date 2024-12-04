package com.qapitol.Calculator;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class Calculator {

	public AppiumDriver driver;

	@SuppressWarnings("deprecation")
	
	@Test
	public void openCalculator() throws MalformedURLException{

//		DesiredCapabilities capability = new DesiredCapabilities();
//		
//		capability.setCapability("platformName", "ANDROID");
//		capability.setCapability("platformVersion", "14");
//		capability.setCapability("deviceName", "vivo V27");
//		
//		capability.setCapability("appPackage", "com.vivo.calculator");
//		capability.setCapability("appActivity", "com.vivo.calculator.Calculator");
//		capability.setCapability("udid", "10BD710XAG000GZ");
//		
//		capability.setCapability("noReset", true); // Prevents app data reset
//        capability.setCapability("automationName", "UiAutomator2"); 
//		
//		
//        URL url = new URL("http://127.0.0.1:4723/wd/hub");
//        //URL url = new URL("https://127.0.0.1:4723/wd/hub");
//		driver = new AndroidDriver(url,capability);
//		
//		System.out.println("Application Started..... ");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "ANDROID");            
		caps.setCapability("platformVersion", "14");
            	caps.setCapability("deviceName", "vivo V27");            
		caps.setCapability("automationName", "UIAutomator2");            				
		caps.setCapability("appPackage", "com.android.deskclock");            
		caps.setCapability("appActivity", "com.android.deskclock.DeskClock");            
		caps.setCapability("udid", "10BD710XAG000GZ");
		caps.setCapability("ignoreHiddenApiPolicyError", "true");
		caps.setCapability("noReset", "true");
		
		System.out.println("Starting Appium session...");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        System.out.println("Appium session started.");
		
        //	URL url = new URL("http://127.0.0.1:4723/wd/hub");
			//AppiumDriver driver = new AndroidDriver(url,caps);
			
			
		
		}
		
	
	
	public void calculator() {
		
		//Thread.sleep(5000);
		//driver.findElement(By.id("new UiSelector().text(\"Calendar\")")).click();
		//driver.findElement(By.id("new UiSelector().text(\"Calendar\")")).click();
	}
	
																					
}


