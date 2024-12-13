package com.orangehrm.base;

import java.io.FileInputStream;
import java.io.FileReader;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Baseclass {
	
	public AppiumDriver driver;
	public Properties props;
	

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void emulatorSetup() {
		
		

		try {
			
			FileReader file = new FileReader(System.getProperty("user.dir") + "\\src\\main\\resources\\files\\TestData.properties");
			props = new Properties();
			props.load(file);
			
			// Set up desired capabilities
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15"); // Adjust based on your device
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 7a");
			// caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\Qapitol
			// QA\\Downloads\\myntra.android.apk");
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			caps.setCapability("appPackage", "com.android.chrome");
			caps.setCapability("appActivity", "com.google.android.apps.chrome.IntentDispatcher");
			// caps.setCapability("udid", "emulator-5554 ");
			caps.setCapability("ignoreHiddenApiPolicyError", "true");
			caps.setCapability("noReset", "true");

			caps.setCapability("autoGrantPermissions", true);
			caps.setCapability("disableAndroidAnimations", true);

			// Initialize Appium Driver

			System.out.println("Starting Appium session...");
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			System.out.println("Appium session started.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
/*	@AfterClass
	public void emulatorTearDown() {
		driver.quit();
	}*/

}
