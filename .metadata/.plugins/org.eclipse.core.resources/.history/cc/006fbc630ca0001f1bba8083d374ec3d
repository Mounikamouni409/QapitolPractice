package com.qapitol.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qaptiol.base.Baseclass;

public class Utilities extends Baseclass {

	public void clickMethod(WebElement element) {
		element.click();
		
	}

	public void sendkeysMethod(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void implicitWait(WebDriver driver, long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public void javascriptExecutor(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		// js.executeScript("window.scrollBy(132,488)", element);
		
	}
	
	
	
	public void javascriptByScroll( int x, int y) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
//		js.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
	}
	

	public static WebElement waitForElementToBeClickable(WebDriver driver, long timeoutInSeconds, By locator) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));

		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public WebElement WaitForElementToBeVisible(WebDriver driver,long timeoutInSeconds, WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
		return wait.until(ExpectedConditions.visibilityOf(element));
	
	}

	public void staleElement(WebDriver driver, WebElement element) {
		 
		 for(int i =0; i<3; i++) {
			 try {
				 element.click();
				 break;
			 }
			 catch(StaleElementReferenceException e){
				 e.printStackTrace();
				 driver.navigate().refresh();
				 element.click();
			 }
		 }
		 
		 
		
	 }

	 public static void wait1() {
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
			
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='avatar mx-auto white']"))));
	 }
}
