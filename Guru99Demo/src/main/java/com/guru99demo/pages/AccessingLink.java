package com.guru99demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99demo.utility.Utilities;

public class AccessingLink extends Utilities {

	public WebDriver driver;

	public AccessingLink(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='dropdown-toggle' and normalize-space()='Selenium']")
	WebElement clickSelenium;

	@FindBy(xpath = "//a[normalize-space()='Accessing Link']")
	WebElement link;

	@FindBy(xpath = "//a[text()='click here']")
	WebElement link1;

	@FindBy(xpath = "//a[text()='click here'][2]")
	WebElement link2;

	public void seleniumDropdown() {

		clickMethod(clickSelenium);

	}

	public void accessingLink() {

		clickMethod(link);

		clickMethod(link1);

		/*
		 * Actions actions = new Actions(driver);
		 * actions.keyDown(Keys.CONTROL).click(link1).keyUp(Keys.CONTROL).perform();
		 */
		navigateBack();

		System.out.println("Link 1 Title: " + driver.getTitle());

		clickMethod(link2);
		System.out.println("Link 2 Title: " + driver.getTitle());

		navigateBack();

	}

}
