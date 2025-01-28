package com.qapitol.testcases;


import org.testng.annotations.Test;

import com.qapitol.base.Baseclass;
import com.qapitol.pages.SearchPage;
import com.qapitol.utilities.BaseTest;



public class SearchTest extends Baseclass {
	
	
	@Test
	public void search() {

		
		SearchPage s = new SearchPage(BaseTest.getDriver());
		
		logger.info("***Search context of FlipKart website Started***");
		try {
			s.closePopupIfPresent();

			logger.info("***Searching for Item(vivo v27) ***");
			s.searchForItem(props.getProperty("searchProduct"));

			logger.info("***Validating the products for given search item ***");
			s.getProductTitles("vivo v27");
		}

		catch (Exception e) {
			logger.error("Test Failed.....");
		}
		
		logger.info("*** Search context of FlipKart website finished ***");
	}
	

}
