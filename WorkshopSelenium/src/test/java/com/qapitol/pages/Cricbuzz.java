package com.qapitol.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qapitol.utilities.Utilities;

public class Cricbuzz extends Utilities{
	
	WebDriver driver;
	
	public Cricbuzz(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//td[@class='cb-srs-pnts-name']")
	List<WebElement> teamsName;
	
	@FindBy(xpath = "//td[@class='cb-srs-pnts-td text-bold']")
	List<WebElement> points;
	

	
	
	public  void getPoints() {
		
		

         System.out.println("Teams with 9 or more points:");
         
         
         
         for (int i = 0; i < points.size(); i++) {    
     		
        	 
        	String pointsText = points.get(i).getText();    
     		
        	int points1 = Integer.parseInt(pointsText);   
     		
        	if (points1 >= 9) {        
     		
        		String teamName = teamsName.get(i).getText();     
     		
        		System.out.println(teamName +"-"+ points1); 
        		
        	}
        }
	}
}
