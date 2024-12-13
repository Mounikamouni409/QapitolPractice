package com.orangehrm.utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.orangehrm.base.Baseclass;

public class Utilities extends Baseclass{
	
	
	
	public void clickMethod(WebElement element) {

		element.click();
	}
	
public void submitMethod(WebElement element) {
		
		element.submit();
	}
	
	public void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	
	public void sendKeysMethod(WebElement element,String text) {
		element.sendKeys(text);
	}
	public void implicitWait(WebDriver driver, long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public void javascriptExecutor(WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}
	
	public void actions(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}

}
