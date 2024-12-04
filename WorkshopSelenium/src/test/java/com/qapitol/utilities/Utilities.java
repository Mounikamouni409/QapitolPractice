package com.qapitol.utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qapitol.base.Baseclass;

public class Utilities extends Baseclass{
	
	WebDriver driver;
	
	public void clickMethod(WebElement element) {
		element.click();
	}
	
	public void sendkeysMethod(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public void getTxt(WebElement element) {
		
		String text = element.getText();
		System.out.println(text);
	}
	
	public void implicitWait(WebDriver driver, long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public void javascriptExecutor(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		// js.executeScript("window.scrollBy(132,488)", element);

	}
	
	
}
