package com.qapitol.testcases;

import org.testng.annotations.Test;

import com.qapitol.base.BaseclassforBookStore;
import com.qapitol.pages.BookStore;

public class BookStoreTest extends BaseclassforBookStore{

	@Test(dataProvider = "Sheet1")
	public void bookStore(String UserName,String FirstName,String Email,String Password,String ConfirmPassword) {
		BookStore b = new BookStore(driver);
		b.registerPage(UserName, FirstName, Email, Password, ConfirmPassword);
		b.assertion();		
		
		
	}
}
