package com.guru99demo.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99demo.utility.Utilities;

public class FileUpload extends Utilities{
	
	public WebDriver driver;

	public FileUpload(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='dropdown-toggle' and normalize-space()='Selenium']")
	WebElement clickSelenium;
	
	@FindBy(xpath = "//a[normalize-space()='File Upload']")
	WebElement fileUpload;
	
	@FindBy(xpath = "//input[@id='uploadfile_0']")
	WebElement chooseFile;
	
	@FindBy(id = "terms")
	WebElement acceptTerms;
	
	@FindBy(id ="submitbutton")
	WebElement submit;
	
	@FindBy(xpath ="//h3/center")
	WebElement text;
	
	public void seleniumDropdown() {

		clickMethod(clickSelenium);

	}
	
	
	public void fileUpload() throws AWTException {
		
		
		
		clickMethod(fileUpload);
		
		implicitWait(driver, 10);
		
		//clickMethod(chooseFile);
		sendkeysMethod(chooseFile, props.getProperty("picturePath"));
		//fileUploader();
		
		clickMethod(acceptTerms);
		
		clickMethod(submit);
		
		getText(text);
	}

}
