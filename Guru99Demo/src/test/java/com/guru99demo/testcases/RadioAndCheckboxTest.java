package com.guru99demo.testcases;

import org.testng.annotations.Test;

import com.guru99demo.base.BaseClass;
import com.guru99demo.pages.RadioAndCheckBoxDemo;

public class RadioAndCheckboxTest extends BaseClass{
	
	@Test
	public void checkBox() {
		RadioAndCheckBoxDemo r = new RadioAndCheckBoxDemo(driver);
		r.seleniumDropdown();
		r.radioAndCheckboxDemo();
	}

}
