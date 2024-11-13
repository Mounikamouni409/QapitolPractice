package com.qapitol.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qapitol.utilities.Utilities;

public class SearchPage extends Utilities {
	
	WebDriver driver;
	
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
	 
	 
	 @FindBy(css = ".KzDlHZ")
	 List<WebElement> productTitles;
	
	 
	 public void closePopupIfPresent() {
	        try {
	            if (closeLoginPopup.isDisplayed()) {
	                closeLoginPopup.click();
	            }
	        } 
	        catch (Exception e) {
	            
	        	e.printStackTrace();
	        }
	    }

	    // Method to perform search
	    public void searchForItem(String query) {
	        searchBar.clear();
	        sendkeysMethod(searchBar, query);
	        clickMethod(searchButton);
	       
	    }
	    
	    public List<WebElement> getProductTitles() {
	    	
	    	//String actualBrand = "vivo v27";
	    	String expectedBrand = "vivo";
	    	
	       
	        for (WebElement title : productTitles) {
	        	
	        	System.out.println(title.getText());
	            String productText = title.getText().toLowerCase();
	            Assert.assertTrue(productText.contains(expectedBrand.toLowerCase()), 
	                    "Product title does not contain the expected brand: " + title.getText());
	        }

	        return productTitles;
	    }
	}
	 
	

