package com.guru99demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99demo.utility.Utilities;

public class Login extends Utilities{
	
	public WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='dropdown-toggle' and normalize-space()='Selenium']")
	WebElement clickSelenium;
	
	@FindBy(linkText = "Login")
	WebElement login;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "passwd")
	WebElement password;
	
	@FindBy(id = "SubmitLogin")
	WebElement signin;
	
	@FindBy(xpath = "//h3")
	WebElement text;
	
	public void seleniumDropdown() {

		clickMethod(clickSelenium);

	}
	
	public void performLogin() {
		clickMethod(login);
		
		sendkeysMethod(email,props.getProperty("email"));
		sendkeysMethod(password, props.getProperty("password"));
		
		clickMethod(signin);
		
		getText(text);
	}

}
