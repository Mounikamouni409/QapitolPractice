package com.guru99demo.testcases;

import org.testng.annotations.Test;

import com.guru99demo.base.BaseClass;
import com.guru99demo.pages.Login;

public class LoginTest extends BaseClass{
	
	@Test
	public void loginTest() {
		
		Login l = new Login(driver);
		l.seleniumDropdown();
		l.performLogin();
		
	}
	
	

}
