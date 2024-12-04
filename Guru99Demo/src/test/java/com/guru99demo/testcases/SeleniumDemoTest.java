package com.guru99demo.testcases;

import org.testng.annotations.Test;

import com.guru99demo.base.BaseClass;
import com.guru99demo.pages.SeleniumDemo;

public class SeleniumDemoTest extends BaseClass{
	
	@Test
	public void demo() {
		
		SeleniumDemo s = new SeleniumDemo(driver);
		s.seleniumDropdown();
		s.flashMovieDemo();
		
		s.seleniumDropdown();
		s.radioAndCheckboxDemo();
		
		s.seleniumDropdown();
		s.tableDemo();
		
		s.seleniumDropdown();
		s.accessingLink();
		
		s.seleniumDropdown();
		s.ajaxDemo();
		
		s.seleniumDropdown();
		s.insideAndOutsideBlockLevelTag();
		
		s.seleniumDropdown();
		s.deleteCustomerForm();
		
		s.seleniumDropdown();
		s.yahoo();
		
		s.seleniumDropdown();
		s.tooltipHandling();
		
		s.seleniumDropdown();
	}

}
