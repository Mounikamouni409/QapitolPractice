package com.qapitol.testcases;

import org.testng.annotations.Test;

import com.qapitol.base.Baseclass;
import com.qapitol.pages.Cricbuzz;

public class CricbuzzTest extends Baseclass{
	
	@Test
	public void cric() {
		
		Cricbuzz c = new Cricbuzz(driver);
		c.getPoints();
	}

}
