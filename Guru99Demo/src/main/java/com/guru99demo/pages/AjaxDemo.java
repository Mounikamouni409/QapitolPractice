package com.guru99demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99demo.utility.Utilities;

public class AjaxDemo extends Utilities{
	
	public WebDriver driver;

	public AjaxDemo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='dropdown-toggle' and normalize-space()='Selenium']")
	WebElement clickSelenium;
	@FindBy(xpath = "//a[normalize-space()='Ajax Demo']")
	WebElement ajax;

	@FindBy(id = "yes")
	WebElement clickYes;

	@FindBy(id = "buttoncheck")
	WebElement checkButton;

	@FindBy(css = ".radiobutton")
	WebElement statusMessage;

	@FindBy(xpath = "//input[@type='reset']")
	WebElement resetButton;
	
	public void seleniumDropdown() {

		clickMethod(clickSelenium);

	}
	
	public void ajaxDemo() {

		clickMethod(ajax);
		// implicitWait(driver, 5);

		if (!clickYes.isSelected()) {

			clickMethod(clickYes);
			System.out.println("Radio Button Yes is selected");
		}

		clickMethod(checkButton);

		getText(statusMessage);

		if (clickYes.isSelected()) {
			clickMethod(resetButton);
		}

	}

}
