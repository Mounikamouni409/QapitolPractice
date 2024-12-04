package com.guru99demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99demo.utility.Utilities;

public class SocialIcon extends Utilities {
	
	public WebDriver driver;

	public SocialIcon(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='dropdown-toggle' and normalize-space()='Selenium']")
	WebElement clickSelenium;
	
	@FindBy(linkText = "Social Icon")
	WebElement social;
	
	@FindBy(partialLinkText = "Test")
	WebElement testing;
	
	@FindBy(tagName = "h1")
	WebElement testingText;
	
	@FindBy(linkText = "Selenium")
	WebElement selenium;
	
	@FindBy(tagName = "h1")
	WebElement seleniumText;
	
	@FindBy(partialLinkText = "Live")
	WebElement liveProject;
	
	@FindBy(xpath = "//h1")
	WebElement liveProjectText;
	
	@FindBy(linkText = "Java")
	WebElement java;
	
	@FindBy(tagName = "h1")
	WebElement javaText;
	
	@FindBy(xpath = "//a[@title='Mail']")
	WebElement mail;
	
	@FindBy(name ="email")
	WebElement enterEmail;
	
	@FindBy(name ="submit")
	WebElement signUp;
	
	public void seleniumDropdown() {

		clickMethod(clickSelenium);

	}
	
	public void socialIcon() {
		
		clickMethod(social);
		
		clickMethod(testing);
		getText(testingText);
		navigateBack();
		
		clickMethod(selenium);
		getText(seleniumText);
		navigateBack();
		
		clickMethod(liveProject);
		getText(liveProjectText);
		navigateBack();
		
		clickMethod(java);
		getText(javaText);
		navigateBack();
		
		implicitWait(driver, 5);
		//clickMethod(mail);
		actions(mail);
		
		sendkeysMethod(enterEmail, "jhgwhgf@gmail.com");
		
		clickMethod(signUp);
		
		
	}

}
