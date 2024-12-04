package com.guru99demo.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99demo.utility.Utilities;

public class DeleteCustomerForm extends Utilities{
	
	public WebDriver driver;

	public DeleteCustomerForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='dropdown-toggle' and normalize-space()='Selenium']")
	WebElement clickSelenium;
	
	@FindBy(xpath = "//a[normalize-space()='Delete Customer Form']")
	WebElement deleteCustomerForm;

	@FindBy(name = "cusid")
	WebElement custIDField;

	@FindBy(xpath = "//input[@name='submit']")
	WebElement submit;
	
	public void seleniumDropdown() {

		clickMethod(clickSelenium);

	}
	
	public void deleteCustomerForm() {

		clickMethod(deleteCustomerForm);
		sendkeysMethod(custIDField, "ajdshgkkakjb");

		clickMethod(submit);

		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();

		System.out.println(alert.getText());

		alert.accept();

		

	}

}
