package com.qapitol.calculator;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorVivo {
	
	public AppiumDriver driver;
	
	@Test
	
	public void openCalculator() throws MalformedURLException{

		/*UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("vivo V27");

		driver = new AndroidDriver(new URI("https://127.0.0.1:4723").toURL(), options);*/

		DesiredCapabilities capability = new DesiredCapabilities();
		
		capability.setCapability("platformName", "ANDROID");
		capability.setCapability("platformVersion", "14");
		capability.setCapability("deviceName", "vivo V27");
		
		capability.setCapability("appPackage", "com.vivo.calculator");
		capability.setCapability("appActivity", "com.vivo.calculator.Calculator");
		capability.setCapability("udid", "10BD710XAG000GZ");
		
		capability.setCapability("noReset", true); // Prevents app data reset
        capability.setCapability("automationName", "UiAutomator2"); 
		
		
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        //URL url = new URL("https://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver(url,capability);
		
		System.out.println("Application Started..... ");
		
		
		
		}

}
