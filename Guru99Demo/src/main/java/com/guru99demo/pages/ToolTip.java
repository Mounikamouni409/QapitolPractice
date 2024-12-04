package com.guru99demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99demo.utility.Utilities;

public class ToolTip extends Utilities{
	
	public WebDriver driver;

	public ToolTip(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='dropdown-toggle' and normalize-space()='Selenium']")
	WebElement clickSelenium;
	
	@FindBy(xpath = "//li/child::a[normalize-space()='Tooltip']")
	WebElement tooltip;
	
	@FindBy(id = "download_now")
	WebElement downloadNow;
	
	@FindBy(tagName = "tbody")
	WebElement tooltipData;
	
	
	public void seleniumDropdown() {

		clickMethod(clickSelenium);

	}
	
	public void tooltipHandling() {
		
		
		clickMethod(tooltip);
		Actions action = new Actions(driver);
		action.moveToElement(downloadNow).build().perform();;
		
		getText(tooltipData);
		
	}

}
