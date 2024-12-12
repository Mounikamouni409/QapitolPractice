package com.qapitol.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
	            if (closeLoginPopup.isDisplayed()) {
	                closeLoginPopup.click();
	            }
	        } 
	        catch (Exception e) {
	            
	        	e.printStackTrace();
	        }
	    }

	    // Method to perform search
	    public void searchForItem(String searchProduct) {
	    	
	        searchBar.clear();
	        sendkeysMethod(searchBar, searchProduct);
	        clickMethod(searchButton);
	       
	    }
	    
	    public List<WebElement> getProductTitles(String product) {
	    	
	    /*	String actualText = "vivo v27";
	    	String expectedText = "vivo v27";*/
	    	
	       
	        for (WebElement title : productTitles) {
	        	
	        	System.out.println(title.getText());
	            
	        	 String productText = title.getText().toLowerCase();
	             System.out.println("Product Title: " + productText);
	             
	             Assert.assertEquals(productText,"Product title does not match");

	             // Assert that each title contains the search term (case-insensitive)
	            /* Assert.assertTrue(productText.contains(product.toLowerCase()), 
	                 "Product title does not match the search : " + title.getText());*/
	        }

	        return productTitles;
	    }
	}
	 
	


