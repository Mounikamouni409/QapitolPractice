package com.guru99demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99demo.utility.Utilities;

public class SeleniumIDE extends Utilities{
	
	public WebDriver driver;

	public SeleniumIDE(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='dropdown-toggle' and normalize-space()='Selenium']")
	WebElement clickSelenium;
	
	@FindBy(linkText = "Selenium IDE Test")
	WebElement selenium_IDE;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "pass")
	WebElement password;
	
	@FindBy(id = "loginbutton")
	WebElement login;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement goButton;
	
	
	public void seleniumDropdown() {

		clickMethod(clickSelenium);

	}
	
	public void seleniumIDE() {
		
		clickMethod(selenium_IDE);
		
		sendkeysMethod(email, props.getProperty("seleniumIDE_email"));
		
		sendkeysMethod(password, props.getProperty("seleniumIDE_password"));
		clickMethod(login);
		implicitWait(driver, 10);
		staleElement(driver, goButton);
		
		clickMethod(goButton);
		
		
	}
	
	
}
