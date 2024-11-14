package com.qapitol.testcases;

import org.testng.annotations.Test;

import com.qapitol.base.Baseclass;
import com.qapitol.pages.SearchPage;

public class SearchTest extends Baseclass{
	
	
	@Test
	public void search() {
		
		SearchPage s = new SearchPage(driver);
		s.closePopupIfPresent();
		s.searchForItem("vivo v27");
		s.getProductTitles("vivo v27");
	}

}
