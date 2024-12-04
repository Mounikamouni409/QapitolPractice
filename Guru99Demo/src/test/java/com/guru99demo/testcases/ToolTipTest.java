package com.guru99demo.testcases;

import org.testng.annotations.Test;

import com.guru99demo.base.BaseClass;
import com.guru99demo.pages.ToolTip;

public class ToolTipTest extends BaseClass{
	
	@Test
	public void tooltip() {
		ToolTip t = new ToolTip(driver);
		t.seleniumDropdown();
		t.tooltipHandling();
	}
	

}
