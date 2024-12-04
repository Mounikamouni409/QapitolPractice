package com.qapitol.myntra.base;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	public AppiumDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void emulatorSetup() {

		try {
			// Set up desired capabilities
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15"); // Adjust based on your device
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 7a");
			// caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\Qapitol
			// QA\\Downloads\\myntra.android.apk");
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			caps.setCapability("appPackage", "com.myntra.android");
			caps.setCapability("appActivity", "com.myntra.android.activities.react.ReactActivity");
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
