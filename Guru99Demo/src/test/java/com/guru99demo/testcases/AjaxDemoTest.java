package com.guru99demo.testcases;

import org.testng.annotations.Test;

import com.guru99demo.base.BaseClass;
import com.guru99demo.pages.AjaxDemo;

public class AjaxDemoTest extends BaseClass{
	
	@Test
	public void ajax() {
		AjaxDemo a = new AjaxDemo(driver);
		a.seleniumDropdown();
		a.ajaxDemo();
	}

}
