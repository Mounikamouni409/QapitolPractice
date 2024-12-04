package com.guru99demo.testcases;

import org.testng.annotations.Test;

import com.guru99demo.base.BaseClass;
import com.guru99demo.pages.AccessingLink;

public class AccessingLinkTest extends BaseClass{
	
	@Test
	public void accessing() {
		AccessingLink a = new AccessingLink(driver);
		a.seleniumDropdown();
		a.accessingLink();
		
	}

}
