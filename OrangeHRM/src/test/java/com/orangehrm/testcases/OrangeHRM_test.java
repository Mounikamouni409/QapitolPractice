package com.orangehrm.testcases;

import org.testng.annotations.Test;

import com.orangehrm.base.Baseclass;
import com.orangehrm.pages.Time_OrangeHRM;

public class OrangeHRM_test  extends Baseclass{
	
	@Test
	public void timeModule() {
		
		Time_OrangeHRM t = new Time_OrangeHRM(driver);
		t.continueWithoutAccount();
		t.searchBar();
		t.login();
		t.time();
		
	}

}
