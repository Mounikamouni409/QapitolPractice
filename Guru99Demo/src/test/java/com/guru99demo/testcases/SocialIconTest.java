package com.guru99demo.testcases;

import org.testng.annotations.Test;

import com.guru99demo.base.BaseClass;
import com.guru99demo.pages.SocialIcon;

public class SocialIconTest extends BaseClass{
	
	@Test
	public void socialIconTest() {
		
		SocialIcon s = new SocialIcon(driver);
		s.seleniumDropdown();
		s.socialIcon();
		
	}
}
