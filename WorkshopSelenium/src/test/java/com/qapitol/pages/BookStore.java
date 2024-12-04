package com.qapitol.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qapitol.utilities.Utilities;

public class BookStore extends Utilities{
	
	WebDriver driver;
	
	public BookStore(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@href='/login']")
	WebElement clickSignin;
	
	@FindBy(xpath="//a[@href='/register?redirect=/']")
	WebElement clickRegister;
	
	
	@FindBy(id="userName")
	WebElement username;
	
	@FindBy(id="firstName")
	WebElement firstName;
	
	@FindBy(id="email")
	WebElement enterEmail;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//input[@placeholder='Confirm Password']")
	WebElement confirmPassword;
	
	@FindBy(xpath = "//button[text()='Register']")
	WebElement register;
	
	@FindBy(xpath = "//div[@class='fade alert alert-danger show']")
	WebElement userText;
	
	
	public void registerPage(String UserName,String FirstName,String Email,String Password,String ConfirmPassword) {
		
		clickMethod(clickSignin);
		implicitWait(driver, 10);
		
		javascriptExecutor(driver, clickRegister);
		
		sendkeysMethod(username, UserName);
		
		sendkeysMethod(firstName, FirstName);
		
		sendkeysMethod(enterEmail, Email);
		
		sendkeysMethod(password, Password);
		
		sendkeysMethod(confirmPassword, ConfirmPassword);
		
		clickMethod(register);
		
		getTxt(userText);
		
		
	}
	
	public void assertion() {
		
		String actualText = userText.getText().replace("\"", "");
		String expectedText ="Username is already taken!!";
		
		Assert.assertEquals(actualText, expectedText,"Texts are not Equal");
	}
	



		
}
