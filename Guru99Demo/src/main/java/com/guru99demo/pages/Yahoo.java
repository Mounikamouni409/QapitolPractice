package com.guru99demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99demo.utility.Utilities;

public class Yahoo extends Utilities {

	public WebDriver driver;

	public Yahoo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='dropdown-toggle' and normalize-space()='Selenium']")
	WebElement clickSelenium;

	@FindBy(xpath = "//a[normalize-space()='Yahoo']")
	WebElement yahoo;

	@FindBy(id = "pager1")
	WebElement itsBursting;

	@FindBy(id = "pager2")
	WebElement itsGames;

	@FindBy(id = "pager3")
	WebElement itsFacebook;

	@FindBy(id = "pager4")
	WebElement itsSocial;

	@FindBy(id = "pager5")
	WebElement itsMobile;

	@FindBy(id = "pager6")
	WebElement itsAlways;

	@FindBy(id = "pager7")
	WebElement itsAll;
	
	public void seleniumDropdown() {

		clickMethod(clickSelenium);

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

		

	}

}
