package com.guru99demo.testcases;

import org.testng.annotations.Test;

import com.guru99demo.base.BaseClass;
import com.guru99demo.pages.InsideAndOutsideBlockLevelTag;

public class InsideAndOutsideBlockLevelTagTest extends BaseClass{
	
	@Test
	public void inside() {
		InsideAndOutsideBlockLevelTag i = new InsideAndOutsideBlockLevelTag(driver);
		i.seleniumDropdown();
		i.insideAndOutsideBlockLevelTag();
	}
}
