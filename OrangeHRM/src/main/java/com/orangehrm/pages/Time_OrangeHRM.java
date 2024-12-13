package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utilities.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Time_OrangeHRM extends Utilities {
	
	AppiumDriver driver;

	public Time_OrangeHRM(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.chrome:id/negative_button\"]")
	WebElement noThanks;
	
	@FindBy(xpath ="//android.widget.Button[@resource-id=\"com.android.chrome:id/signin_fre_continue_button\"]")
	WebElement withAccount;
	
	@FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.chrome:id/button_primary\"]")
	WebElement yes;
	
	@FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.chrome:id/ack_button\"]")
	WebElement gotIt;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.android.chrome:id/search_box_text\"]")
	WebElement search;
	
	@FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.android.chrome:id/omnibox_suggestions_dropdown\"]/android.view.ViewGroup[1]")
	WebElement searchSuggestion;
	
	@FindBy(xpath = "//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]/android.widget.EditText")
	WebElement userName;
	
	@FindBy(xpath = "//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View/android.view.View[3]/android.view.View[6]/android.widget.EditText")
	WebElement password;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Login\"]")
	WebElement login;
	
	@FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.chrome:id/positive_button\"]")
	WebElement click_ok;
	
	@FindBy(xpath ="//android.widget.TextView[@text=\"\"]")
	WebElement dashboard;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"This Week\"]")
	WebElement select_Time;
	
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Timesheets \"]")
	WebElement clickOnTimesheets;
	
	@FindBy(xpath = "//android.view.MenuItem[@text=\"My Timesheets\"]")
	WebElement myTimesheet;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Submit\"]")
	WebElement submitMyTimesheet;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Status: Submitted\"]")
	WebElement submitStatus;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Attendance \"]")
	WebElement clickonAttendance;
	
	@FindBy(xpath = "//android.view.MenuItem[@text=\"My Records\"]")
	WebElement clickMyRecords;
	
	@FindBy(xpath  ="//android.widget.Button[@text=\"\"]")
	WebElement myattendanceDropdown;
	
	
	public void continueWithoutAccount() {
		//implicitWait(driver,10);
		//clickMethod(noThanks);
		
		implicitWait(driver,10);
		clickMethod(withAccount);
		
		implicitWait(driver,5);
		clickMethod(yes);
		
		implicitWait(driver,10);
		clickMethod(gotIt);
		
		System.out.println("In Chrome account setup");
		
	}
	
	public void searchBar() {
		implicitWait(driver, 10);
		
		sendKeysMethod(search, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		actions(driver,searchSuggestion);
		
		System.out.println("Navigated through search suggestion");
		
		
	}
	
	public void login() {
		
		implicitWait(driver, 10);
		
		sendKeysMethod(userName, "Admin");
		
		sendKeysMethod(password, "admin123");
		
		implicitWait(driver, 10);
		clickMethod(login);
		
		System.out.println("Login successfully...");
		
		implicitWait(driver, 10);
		clickMethod(click_ok);
	}
	
	public void time() {
		implicitWait(driver, 10);
		clickMethod(dashboard);
		
		implicitWait(driver, 10);
		clickMethod(select_Time);
		
		implicitWait(driver, 10);
		clickMethod(clickOnTimesheets);
		
		implicitWait(driver, 10);
		clickMethod(myTimesheet);
		
		implicitWait(driver, 10);
	//	clickMethod(submitMyTimesheet);
		
		//getText(submitStatus);
	}
	

	

}
