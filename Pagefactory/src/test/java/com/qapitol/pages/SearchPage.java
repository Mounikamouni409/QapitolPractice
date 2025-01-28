package com.qapitol.pages;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qapitol.utilities.Utilities;

public class SearchPage extends Utilities {
	
	public WebDriver driver;
	
	 public SearchPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	
	
	
	 @FindBy(name = "q")
	 WebElement searchBar;
	 
	 @FindBy(css = "button[type='submit']")
	 WebElement searchButton;
	 
	// Close button on login pop-up
	 @FindBy(css = "button._2KpZ6l._2doB4z")  
	 WebElement closeLoginPopup;
	 
	 
	 @FindBy(xpath = "//div[@class='KzDlHZ' and contains(text(),'vivo V27')]")
	 List<WebElement> productTitles;
	
	 
	 public void closePopupIfPresent() {
	        try {
	        	
	        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.elementToBeClickable(closeLoginPopup));
	            if (closeLoginPopup.isDisplayed()) {
	            	
	            	

	                closeLoginPopup.click();
	            }
	        } 
	        catch (Exception e) {
	            
	        	System.out.println("Popup not present or could not be closed.");
	        }
	    }

	    // Method to perform search
	    public void searchForItem(String searchProduct) {
	    	
	        searchBar.clear();
	        sendkeysMethod(searchBar, searchProduct);
	        clickMethod(searchButton);
	        
	        
	       
	    }
	    
	    public List<WebElement> getProductTitles(String product) {
	    	
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfAllElements(productTitles));
	        
	        for (WebElement title : productTitles) {
	        	
	        	System.out.println(title.getText());
	            
	        	 String productText = title.getText().toLowerCase();
	             System.out.println("Product Title: " + productText);
	            
	             Assert.assertTrue(productText.contains(product.toLowerCase()), 
	                     "Product title does not match the search term: " + title.getText());
	             
	             
	        }

	        return productTitles;
	    }
	}
	 
	


