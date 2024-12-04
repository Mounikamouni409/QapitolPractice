package com.guru99demo.testcases;

import org.testng.annotations.Test;

import com.guru99demo.base.BaseClass;
import com.guru99demo.pages.FlashMovieDemo;

public class FlashMovieDemoTest extends BaseClass {
	
	@Test
	public void falshMovie() {
		
		FlashMovieDemo f = new FlashMovieDemo(driver);
		f.seleniumDropdown();
		f.flashMovieDemo();
	}

}
