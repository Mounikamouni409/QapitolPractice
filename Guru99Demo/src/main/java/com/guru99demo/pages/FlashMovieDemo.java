package com.guru99demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99demo.utility.Utilities;

public class FlashMovieDemo extends Utilities{
	
	public WebDriver driver;

	public FlashMovieDemo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='dropdown-toggle' and normalize-space()='Selenium']")
	WebElement clickSelenium;
	
	@FindBy(xpath = "//a[normalize-space()='Flash Movie Demo']")
	WebElement flashDemo;

	@FindBy(xpath = "//font[text()='DEMO Flash Movie']")
	WebElement flashDemoText;
	
	public void seleniumDropdown() {

		clickMethod(clickSelenium);

	}

	public void flashMovieDemo() {

		actions(flashDemo);
		getText(flashDemoText);
	}

}
