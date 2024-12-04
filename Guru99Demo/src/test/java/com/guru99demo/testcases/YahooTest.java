package com.guru99demo.testcases;

import org.testng.annotations.Test;

import com.guru99demo.base.BaseClass;
import com.guru99demo.pages.Yahoo;

public class YahooTest extends BaseClass{
	
	@Test
	public void yahootest() {
		
		Yahoo y = new Yahoo(driver);
		y.seleniumDropdown();
		y.yahoo();
	}

}
