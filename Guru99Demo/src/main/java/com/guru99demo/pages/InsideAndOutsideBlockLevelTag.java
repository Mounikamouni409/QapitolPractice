package com.guru99demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99demo.utility.Utilities;

public class InsideAndOutsideBlockLevelTag extends Utilities {

	public WebDriver driver;

	public InsideAndOutsideBlockLevelTag(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='dropdown-toggle' and normalize-space()='Selenium']")
	WebElement clickSelenium;

	@FindBy(xpath = "//a[normalize-space()='Inside & Outside Block Level Tag']")
	WebElement inside;

	@FindBy(xpath = " //a[normalize-space()='Inside a block-level tag.']")
	WebElement insideBlock;

	@FindBy(xpath = " //span[normalize-space()='Outside a block-level tag.']")
	WebElement outsideBlock;

	public void seleniumDropdown() {

		clickMethod(clickSelenium);

	}

	public void insideAndOutsideBlockLevelTag() {

		clickMethod(inside);

		clickMethod(insideBlock);
		System.out.println("Inside a block-level tag: " + driver.getTitle());
		
		navigateBack();

		clickMethod(outsideBlock);
		System.out.println("Outside a block-level tag: " + driver.getTitle());

		navigateBack();

	}

}
