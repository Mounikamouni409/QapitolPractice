package com.qapitol.Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	
	public void onStart​(ITestContext context) {
		
	}
	
	public void onFinish​(ITestContext context) {
		
	}
	
	public void onTestStart(ITestResult result) {
		
	}
	
	public void onTestSuccess(ITestResult result) {
		
		
	}
	
	public void onTestFailure(ITestResult result) {
		
		//test.log(LogStatus.FAIL, result.getName()+ " is Fail");
		
	}
	public void onTestSkipped(ITestResult result) {
		
	}
	
	
	

}
