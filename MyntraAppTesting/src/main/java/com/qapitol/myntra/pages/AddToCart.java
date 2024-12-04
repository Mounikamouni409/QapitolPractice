package com.qapitol.myntra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qapitol.myntra.utilities.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AddToCart extends Utilities {
	AppiumDriver driver;

	public AddToCart(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.Button[@resource-id=\"com.myntra.android:id/askPermission\"]")
	WebElement notification;
	
	@FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")
	WebElement allow;
	
	@FindBy(xpath ="//android.view.ViewGroup[@content-desc=\"BANNER_2\"]/android.widget.ImageView")
	WebElement banner;
	
	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"TOPNAV_CAROUSEL_1_3\"])[1]/android.view.ViewGroup")
	WebElement clickTops;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"search\"]")
	WebElement clickSearch;

	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"search_default_search_text_input\"]")
	WebElement productSearch;

	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"search_autosuggest_product_click_0\"])[1]")
	WebElement suggestion;

	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"image_image_container\"])[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement product;

	@FindBy(xpath = "//android.widget.TextView[@text=\"Add to Bag\"]")
	WebElement addtoCart;

	@FindBy(xpath = "//android.widget.HorizontalScrollView[@content-desc=\"size_list\"]/android.view.ViewGroup/android.view.ViewGroup[3]")
	WebElement clickDone;

	@FindBy(xpath = "//android.widget.HorizontalScrollView[@content-desc=\"size_list\"]/android.view.ViewGroup/android.view.ViewGroup[3]")
	WebElement size;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\\\"bag\\\"]/android.view.ViewGroup")
	WebElement checkCart;

	// @FindBy(xpath = " ")

	public void notificationsHandle() {
		try {
			if (notification.isDisplayed()) {
				implicitWait(5);
				clickMethod(notification);
				
				implicitWait(5);
				clickMethod(allow);
				
				implicitWait(5);
				clickMethod(banner);
			}
			else {
				clickMethod(banner);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		
		
		
		
	}
	public void homePage() {
		
		implicitWait(5);
		clickMethod(clickTops);
		System.out.println("");
		
		implicitWait(5);
		clickMethod(addtoCart);
		
	}

}
