package com.qapitol.myntra.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.qapitol.myntra.base.BaseClass;

public class AddToCart_Test extends BaseClass {

	

	@SuppressWarnings("deprecation")
	@Test
	public void addToCart() throws InterruptedException {

		try {

			
		/*	 WebElement notification = driver.findElement( By.xpath("//android.widget.Button[@resource-id=\"com.myntra.android:id/closeDialog\"]")); 
			 
			 if (notification.isDisplayed()) {
				 notification.click();
				 
			 }*/

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			/*
			 * WebElement selectCategory = driver.findElement( By.xpath(
			 * "//android.view.ViewGroup[@content-desc=\"BANNER_2\"]/android.widget.ImageView"
			 * )); selectCategory.click();
			 * 
			 */
			WebElement clickTops = driver.findElement(By.xpath(
					"(//android.view.ViewGroup[@content-desc=\"TOPNAV_CAROUSEL_1_3\"])[1]/android.view.ViewGroup"));
			clickTops.click();
			System.out.println("selected the category...");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement clickSearch = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"search\"]"));
			clickSearch.click();
			System.out.println("Clicked on Search button");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement productSearch = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"search_default_search_text_input\"]"));
			productSearch.sendKeys("Tops");
			System.out.println("Search successfully happen for tops..");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement suggestion = driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"search_autosuggest_product_click_0\"])[1]"));
			
			Actions actions = new Actions(driver);
			actions.moveToElement(suggestion).click().build().perform();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement product = driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"image_image_container\"])[2]/android.view.ViewGroup/android.widget.ImageView"));
			actions.moveToElement(product).click().build().perform();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement addToCart = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Add to Bag\"]"));
			addToCart.click();
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement size = driver.findElement(By.xpath("//android.widget.HorizontalScrollView[@content-desc=\"size_list\"]/android.view.ViewGroup/android.view.ViewGroup[3]"));
			size.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement clickDone = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"buy_done_button\"]"));
			clickDone.click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement checkCart = driver
					.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"bag\"]/android.view.ViewGroup"));
			checkCart.click();

			String command = "adb shell screencap -p /sdcard/screenshot.png";

			// Execute the ADB command
			Process process = Runtime.getRuntime().exec(command);
			process.waitFor();

			String zoomInCommand = "adb shell input swipe 300 1000 500 1000 200 && "
					+ "adb shell input swipe 700 1000 500 1000 200";

			// Execute the ADB command to simulate the zoom-in gesture
			process = Runtime.getRuntime().exec(zoomInCommand);
			process.waitFor();

			System.out.println("Zoom-In gesture performed.");

			String zoomOutCommand = "adb shell input swipe 500 1000 300 1000 200 && "
					+ "adb shell input swipe 500 1000 700 1000 200";

			// Execute the ADB command to simulate the zoom-out gesture
			process = Runtime.getRuntime().exec(zoomOutCommand);
			process.waitFor();

			System.out.println("Zoom-Out gesture performed.");
			
			
			
			

		} catch (Exception e) {

			e.printStackTrace();
		}

		

	}
}
