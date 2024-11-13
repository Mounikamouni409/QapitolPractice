package com.qapitol.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qapitol.utilities.Utilities;

public class Elements extends Utilities {

	WebDriver driver;

	public Elements(WebDriver driver) {
		this.driver = driver;
	}

	By elements = By.xpath("//div[@class='avatar mx-auto white']");
	// By elements = By.xpath("//h5[text()='Elements']/ancestor::div[@class='card
	// mt-4 top-card']");
	// By text = By.xpath("//span[normalize-space()='Text Box']/parent::li");
	// By text = By.xpath("//li[@id='item-0']/child::span[normalize-space()='Text
	// Box']");
	By text = By.id("item-0");
	By fullname = By.xpath("//input[@class=' mr-sm-2 form-control']");
	By email = By.id("userEmail");
	By current = By.id("currentAddress");
	By permanent = By.id("permanentAddress");
	By submit = By.id("submit");
	By output = By.id("output");

	// Checkbox

	By checkbox = By.id("item-1");
	By toggle = By.xpath("//button[@class='rct-collapse rct-collapse-btn']");
	By check = By.cssSelector(".rct-checkbox");
	By result = By.id("result");
	
	
	//Radio button
	
	By button = By.id("item-2");
	//By selectRadio = By.cssSelector(".custom-control.custom-radio.custom-control-inline");
	
	By click_yes = By.xpath("//label[@for='yesRadio']");
	
	
	//WebTables
	
	By webTables = By.xpath("//span[text()='Web Tables']");
	By add = By.id("addNewRecordButton");
	By firstname = By.id("firstName");
	By lastname = By.id("lastName");
	By userEmail =By.id("userEmail");
	By age = By.id("age");
	By salary = By.id("salary");
	By depart = By.id("department");
	By submit_web = By.id("submit");
	
	public void elements() {

		javascriptByScroll(0, 200);

		WebElement element = driver.findElement(elements);
		WaitForElementToBeVisible(driver, 5, element);
		clickMethod(element);

	}

	public void textBox() {

		WebElement textBox = driver.findElement(text);
		clickMethod(textBox);

	}

	public void fullName() {
		WebElement name = driver.findElement(fullname);
		sendkeysMethod(name, "Mounika");
	}

	public void enterEmail() {
		WebElement enter_mail = driver.findElement(email);
		sendkeysMethod(enter_mail, "abc@gmail.com");
	}

	public void current_Address() {
		WebElement address = driver.findElement(current);
		sendkeysMethod(address, "Bangalore, Karnataka");
	}

	public void permanent_Address() {
		WebElement address = driver.findElement(permanent);
		sendkeysMethod(address, "Thatiparti,Nellore, Andhrapradesh");
	}

	public void submit_Data() {

		WebElement button = driver.findElement(submit);
		javascriptByScroll(0, 300);
		clickMethod(button);

	}

	public void getOutput() {
		WebElement out = driver.findElement(output);
		getText(out);
	}

	// Checkbox
	public void clickCheckbox() {

		WebElement check = driver.findElement(checkbox);
		clickMethod(check);

	}

	public void clickToggle() {
		WebElement togg = driver.findElement(toggle);
		clickMethod(togg);
		
	}

	public void selectCheckbox() {
		/*List<WebElement> checkboxes=driver.findElements(check);
		//int size=chkboxes.size();
		
		for (WebElement checkbox : checkboxes) {
			
			if(checkbox.getText().equals("Desktop")) {
				if (!checkbox.isSelected()) {
					checkbox.click();  // Select the checkbox if it's not already selected
					System.out.println("Checkbox selected.");
				} 
				else {
					System.out.println("Checkbox already selected.");
				}
			}
        }*/
		
		WebElement selectElement = driver.findElement(check);
		clickMethod(selectElement);
		
		WebElement resultCheckBox = driver.findElement(result);
		getText(resultCheckBox);
	}
	
	// Radio Button
	
	public void radioButton() {
		WebElement clickradio = driver.findElement(button);
		clickMethod(clickradio);
		
		WebElement yes = driver.findElement(click_yes);
		//WaitForElementToBeVisible(driver, 5, yes);
		//javascriptByScroll(0, 200);
		clickMethod(yes);
		
		/*List<WebElement> radioButtons = driver.findElements(selectRadio);

        // Iterate through each radio button and select the one with a specific value
        for (WebElement radioButton : radioButtons) {
            String value = radioButton.getAttribute("yesRadio");

            // Select the radio button with a specific value (e.g., "option2")
            if (value == null || value.isEmpty()) {
            	System.out.println("Warning: Radio button does not have a 'value' attribute.");
            	value = radioButton.getAttribute("yesRadio");
                if (!radioButton.isSelected()) {
                    radioButton.click(); // Click to select the radio button
                    System.out.println("Radio button with value 'Yes' selected.");
                } else {
                    System.out.println("Radio button with value 'Yes' is already selected.");
                }
                break; // Exit the loop once the desired radio button is selected
            }
        }*/
		
		
		
		
	}
	
	// WebTables
	
	public void webtables() {
		
		WebElement table = driver.findElement(webTables);
		clickMethod(table);
		
		WebElement click_add = driver.findElement(add);
		clickMethod(click_add);
		
		WebElement firstName = driver.findElement(firstname);
		sendkeysMethod(firstName, "Mounika");
		
		WebElement lastName = driver.findElement(lastname);
		sendkeysMethod(lastName, "Patnam");
		
		WebElement emailElement = driver.findElement(userEmail);
		sendkeysMethod(emailElement, "mounika@gmail.com");
		
		WebElement enter_age = driver.findElement(age);
		sendkeysMethod(enter_age, "25");
		
		WebElement enter_salary = driver.findElement(salary);
		sendkeysMethod(enter_salary, "387828");
		
		WebElement department = driver.findElement(depart);
		sendkeysMethod(department, "Engineering");
		javascriptByScroll(985, 432);
		
		
		WebElement submit = driver.findElement(submit_web);
		WaitForElementToBeVisible(driver, 5, submit);
	    clickMethod(submit);
		
	}
}
	
		

