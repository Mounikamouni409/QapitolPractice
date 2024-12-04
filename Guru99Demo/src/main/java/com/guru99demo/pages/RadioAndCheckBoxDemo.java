package com.guru99demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99demo.utility.Utilities;

public class RadioAndCheckBoxDemo extends Utilities{
	
	public WebDriver driver;

	public RadioAndCheckBoxDemo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='dropdown-toggle' and normalize-space()='Selenium']")
	WebElement clickSelenium;
	
	@FindBy(xpath = "//a[text()='Radio & Checkbox Demo']")
	WebElement radio;

	@FindBy(xpath = "//input[@type='radio']")
	WebElement radioButton;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement checkbox;

	public void seleniumDropdown() {

		clickMethod(clickSelenium);

	}

	public void radioAndCheckboxDemo() {
		actions(radio);

		if (!radioButton.isSelected()) {
			clickMethod(radioButton);
			System.out.println("Radio button is selected.");
		} else {
			System.out.println("Radio button is not selected.");
		}

		if (!checkbox.isSelected()) {
			clickMethod(checkbox);
			System.out.println("Checkbox is selected.");
		} else {
			System.out.println("Checkbox is not selected.");
		}

	}
}
