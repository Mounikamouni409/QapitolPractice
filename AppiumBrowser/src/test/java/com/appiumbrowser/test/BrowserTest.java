package com.appiumbrowser.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.appiumbrowser.base.Baseclass;

public class BrowserTest extends Baseclass{
	
	@BeforeSuite
	public void startExecution() {
		
		service = startServer();
		driver = capabilities("Chrome");
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void browser() {
		
		try {
			System.out.println("Execution Started.... !!!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
		
		
	}
	
	/*@AfterSuite
	public void terminate() {
		
		stopServer();
	}*/
	
}
