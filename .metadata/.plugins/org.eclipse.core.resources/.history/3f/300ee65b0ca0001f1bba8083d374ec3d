package com.qapitol.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qapitol.utilities.Utilities;

public class Elements extends Utilities {

	WebDriver driver;

	public Elements(WebDriver driver) {
		this.driver = driver;
	}

	By elements = By.xpath("//div[@class='avatar mx-auto white']");
	// By elements = By.xpath("//h5[text()='Elements']/ancestor::div[@class='card
	// mt-4 top-card']");
	// By text = By.xpath("//span[normalize-space()='Text Box']/parent::li");
	// By text = By.xpath("//li[@id='item-0']/child::span[normalize-space()='Text
	// Box']");
	By text = By.id("item-0");
	By fullname = By.xpath("//input[@class=' mr-sm-2 form-control']");
	By email = By.id("userEmail");
	By current = By.id("currentAddress");
	By permanent = By.id("permanentAddress");
	By submit = By.id("submit");

	public void elements() {

		javascriptByScroll(0, 200);
		
		WebElement element = driver.findElement(elements);
		WaitForElementToBeVisible(driver, 5, element);
		clickMethod(element);


	}

	public void textBox(){
		
		WebElement textBox = driver.findElement(text);
		clickMethod(textBox);

	}

	public void fullName() {
		WebElement name = driver.findElement(fullname);
		sendkeysMethod(name, "Mounika");
	}
	
	public void enterEmail() {
		WebElement enter_mail = driver.findElement(email);
		sendkeysMethod(enter_mail, "abc@gmail.com");
	}
	
	public void current_Address() {
		WebElement address = driver.findElement(current);
		sendkeysMethod(address, "Bangalore, Karnataka");
	}
	
	public void permanent_Address() {
		WebElement address = driver.findElement(permanent);
		sendkeysMethod(address, "Thatiparti,Nellore, Andhrapradesh");
	}
	
	public void submit_Data() {
		
		WebElement button = driver.findElement(submit);
		javascriptByScroll(0, 300);
		clickMethod(button);
		
	}
}
