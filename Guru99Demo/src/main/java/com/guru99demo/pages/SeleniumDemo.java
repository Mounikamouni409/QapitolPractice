package com.guru99demo.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99demo.utility.Utilities;

public class SeleniumDemo extends Utilities {

	public WebDriver driver;

	public SeleniumDemo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='dropdown-toggle' and normalize-space()='Selenium']")
	WebElement clickSelenium;

	@FindBy(xpath = "//a[normalize-space()='Flash Movie Demo']")
	WebElement flashDemo;

	@FindBy(xpath = "//font[text()='DEMO Flash Movie']")
	WebElement flashDemoText;

	@FindBy(xpath = "//a[text()='Radio & Checkbox Demo']")
	WebElement radio;

	@FindBy(xpath = "//input[@type='radio']")
	WebElement radioButton;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement checkbox;

	@FindBy(xpath = "//a[normalize-space()='Table Demo']")
	WebElement table;

	@FindBy(tagName = "tr")
	List<WebElement> rows;

	@FindBy(tagName = "td")
	List<WebElement> cells;

	@FindBy(xpath = "//tr/td")
	WebElement specificCell;

	@FindBy(xpath = "//a[normalize-space()='Accessing Link']")
	WebElement link;

	@FindBy(xpath = "//a[text()='click here']")
	WebElement link1;

	@FindBy(xpath = "//a[text()='click here'][2]")
	WebElement link2;

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

	@FindBy(xpath = "//a[normalize-space()='Inside & Outside Block Level Tag']")
	WebElement inside;

	@FindBy(xpath = " //a[normalize-space()='Inside a block-level tag.']")
	WebElement insideBlock;

	@FindBy(xpath = " //span[normalize-space()='Outside a block-level tag.']")
	WebElement outsideBlock;

	@FindBy(xpath = "//a[normalize-space()='Delete Customer Form']")
	WebElement deleteCustomerForm;

	@FindBy(name = "cusid")
	WebElement custIDField;

	@FindBy(xpath = "//input[@name='submit']")
	WebElement submit;

	@FindBy(xpath = "//a[normalize-space()='Yahoo']")
	WebElement yahoo;
	
	@FindBy(id = "pager1")
	WebElement itsBursting;
	
	@FindBy(id="pager2")
	WebElement itsGames;
	
	@FindBy(id="pager3")
	WebElement itsFacebook;
	
	@FindBy(id = "pager4")
	WebElement itsSocial;
	
	@FindBy(id = "pager5")
	WebElement itsMobile;
	
	@FindBy(id = "pager6")
	WebElement itsAlways;
	
	@FindBy(id = "pager7")
	WebElement itsAll;
	
	@FindBy(xpath = "//a[normalize-space()='Tooltip']")
	WebElement tooltip;
	
	@FindBy(id = "download_now")
	WebElement downloadNow;
	
	@FindBy(tagName = "tbody")
	WebElement tooltipData;

	public void seleniumDropdown() {

		clickMethod(clickSelenium);

	}

	public void flashMovieDemo() {

		actions(flashDemo);
		getText(flashDemoText);
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

	public void tableDemo() {

		actions(table);

		System.out.println("Total Number of Rows:: " + rows.size());

		System.out.println("Total Number of cells :: " + cells.size());

		System.out.println("Specific cell value::");
		getText(specificCell);

	}

	public void accessingLink() {
		
		clickMethod(link);
		
		clickMethod(link1);

	/*	Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(link1).keyUp(Keys.CONTROL).perform();*/
		driver.navigate().back();
		
		//implicitWait(driver, 5);
		System.out.println("Link 1 Title: "+driver.getTitle());
		

		clickMethod(link2);
		System.out.println("Link 2 Title: "+ driver.getTitle());
		

		driver.navigate().back();

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

	public void insideAndOutsideBlockLevelTag() {

		clickMethod(inside);

		clickMethod(insideBlock);

		driver.navigate().back();

		clickMethod(outsideBlock);

		driver.navigate().back();

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
	
	public void yahoo() {
		
		clickMethod(yahoo);
		
		clickMethod(itsBursting);
		getText(itsBursting);
		
		clickMethod(itsGames);
		getText(itsGames);
		
		clickMethod(itsFacebook);
		getText(itsFacebook);
		
		clickMethod(itsSocial);
		getText(itsSocial);
		
		clickMethod(itsMobile);
		getText(itsMobile);
		
		clickMethod(itsAlways);
		getText(itsAlways);
		
		clickMethod(itsAll);
		getText(itsAll);
		
		navigateBack();
		
		alertHandling();
		
		
		
		
	}
	
	public void tooltipHandling() {
		implicitWait(driver, 5);
		
		actions(tooltip);
		Actions action = new Actions(driver);
		action.moveToElement(downloadNow);
		
		getText(tooltipData);
		
	}

}
