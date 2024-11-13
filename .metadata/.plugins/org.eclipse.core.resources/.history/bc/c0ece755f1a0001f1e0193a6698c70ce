package com.qapitol.utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qaptiol.base.Baseclass;

public class Utilities extends Baseclass {

	public void clickMethod(WebElement element) {
		element.click();

	}

	public void sendkeysMethod(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void getText(WebElement element) {
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

	public void javascriptByScroll(int x, int y) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
//		js.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
	}

	public static WebElement waitForElementToBeClickable(WebDriver driver, long timeoutInSeconds, By locator) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));

		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public WebElement WaitForElementToBeVisible(WebDriver driver, long timeoutInSeconds, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
		return wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void staleElement(WebDriver driver, WebElement element) {

		for (int i = 0; i < 3; i++) {
			try {
				element.click();
				break;
			} catch (StaleElementReferenceException e) {
				e.printStackTrace();
				driver.navigate().refresh();
				element.click();
			}
		}

	}

	//generic method of dropdown
		public void selectByOptionText(Select dropdown, String optionText) {
	        List<WebElement> options = dropdown.getOptions();
	      //System.out.println(options.size()); to get size
	        for (WebElement element : options) {
	        	//System.out.println(element.getText());//to get all text 
	            if (element.getText().equalsIgnoreCase(optionText)) {
	            	element.click();
	                break; 
	            }
	           
	        }
		}
}
