package com.guru99demo.testcases;

import org.testng.annotations.Test;

import com.guru99demo.base.BaseClass;
import com.guru99demo.pages.SeleniumIDE;

public class SeleniumIDETest extends BaseClass{
	
	
	@Test
	public void seleniumIDETest() {
		SeleniumIDE s = new SeleniumIDE(driver);
		s.seleniumDropdown();
		s.seleniumIDE();
		
	}

}
