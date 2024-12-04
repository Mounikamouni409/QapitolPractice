package com.qapitol.myntra.utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qapitol.myntra.base.BaseClass;

public class Utilities extends BaseClass{
	
	
	public void clickMethod(WebElement element) {
		
		element.click();
	}
	
	public void sendkeysMethod(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	
	public void implicitWait(int time) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public void javascriptExecutor(WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}
	
	public void actions(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}
	
	

}
