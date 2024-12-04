package com.guru99demo.testcases;

import org.testng.annotations.Test;

import com.guru99demo.base.BaseClass;
import com.guru99demo.pages.TableDemo;

public class TableDemoTest extends BaseClass{
	
	
	@Test
	public void table() {
		
		TableDemo t = new TableDemo(driver);
		t.seleniumDropdown();
		t.tableDemo();
	}
	
	

}
