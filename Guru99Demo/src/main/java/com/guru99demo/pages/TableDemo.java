package com.guru99demo.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99demo.utility.Utilities;

public class TableDemo extends Utilities {
	
	public WebDriver driver;

	public TableDemo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='dropdown-toggle' and normalize-space()='Selenium']")
	WebElement clickSelenium;
	
	
	@FindBy(xpath = "//a[normalize-space()='Table Demo']")
	WebElement table;

	@FindBy(tagName = "tr")
	List<WebElement> rows;

	@FindBy(tagName = "td")
	List<WebElement> cells;

	@FindBy(xpath = "//tr/td")
	WebElement specificCell;
	
	
	public void seleniumDropdown() {

		clickMethod(clickSelenium);

	}
	
	public void tableDemo() {

		actions(table);

		System.out.println("Total Number of Rows:: " + rows.size());

		System.out.println("Total Number of cells :: " + cells.size());

		System.out.println("Specific cell value::");
		getText(specificCell);

	}

}
