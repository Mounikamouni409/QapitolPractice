package com.qapitol.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	private static ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return driverThread.get(); // Return the WebDriver for the current thread
	}

	
	public static void setDriver(String brow) {
        WebDriver driver = null;
        if (brow.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (brow.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (brow.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        driverThread.set(driver); // Set the WebDriver for the current thread
    }

    public static void quitDriver() {
       
    	getDriver().quit(); // Quit the current thread's WebDriver
        driverThread.remove(); // Remove the driver from ThreadLocal
    }
    
   
}
