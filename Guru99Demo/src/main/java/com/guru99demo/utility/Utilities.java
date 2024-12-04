package com.guru99demo.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.guru99demo.base.BaseClass;



public class Utilities extends BaseClass{
	
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
	
	public void navigateBack() {
		
		driver.navigate().back();
	}

	public void implicitWait(WebDriver driver, long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public void actions(WebElement element) {
		
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}
	
	public void alertHandling() {
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
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
		
		 public String switchToNewWindow(WebDriver driver, String mainWindowHandle) {
		        Set<String> allWindowHandles = driver.getWindowHandles();
		        for (String handle : allWindowHandles) {
		            if (!handle.equals(mainWindowHandle)) {
		                driver.switchTo().window(handle);
		                break;
		            }
		        }
		        return driver.getWindowHandle();
		    }
		 
		 public void fileUploader() throws AWTException {
			 Robot robot = new Robot();
				robot.delay(2000);
				
				// put the path to file in a clipboard
				StringSelection ss = new StringSelection(props.getProperty("picturePath"));
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
				
				//CTRL+V
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_V);
				
				//enter
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
		 }
}