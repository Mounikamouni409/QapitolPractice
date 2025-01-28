package com.qapitol.utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.qapitol.base.Baseclass;

public class ExtentReportManager implements ITestListener {

	public ExtentSparkReporter sparkReporter;// template and UI of report
	public ExtentReports extent; // populate common info on the report
	public ExtentTest test; // creating testcase entries in the report and update the status of test methods

	public String repName; // name of report
	
	@Override
	public void onStart(ITestContext context) {
		// when initiate the testcase or testcase started

		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
		repName = "Test-Report-" + timeStamp + ".html";

		String reportPath = System.getProperty("user.dir") + "/reports/" + repName;
		sparkReporter = new ExtentSparkReporter(reportPath);

		// sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") +
		// "/reports/" + repName);

		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);

		extent.setSystemInfo("Application Name", "Flipkart");
		extent.setSystemInfo("Module", "Search Context");
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		// extent.setSystemInfo("TesterName", props.getProperty("testerName"));
		extent.setSystemInfo("Environment", "QA");

		// Instead od hard coding the data we are fetcthing those values from xml file

		String os = context.getCurrentXmlTest().getParameter("os");
		extent.setSystemInfo("Operating System", os);

		String browser = context.getCurrentXmlTest().getParameter("browser");
		extent.setSystemInfo("Browser", browser);

		// Display the grouping information

		List<String> includedGroups = context.getCurrentXmlTest().getIncludedGroups();
		if (!includedGroups.isEmpty()) {
			extent.setSystemInfo("Groups", includedGroups.toString());
		}

		/*
		 * extent.setSystemInfo("Computer Name", "local host"); // this method takes key
		 * and value like
		 * 
		 * 
		 * extent.setSystemInfo("OS", "Windows"); extent.setSystemInfo("Browser name ",
		 * "Chrome");
		 */
		
		

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		test = extent.createTest(result.getTestClass().getName());

		test.assignCategory(result.getMethod().getGroups()); // to display groups in report
		test.log(Status.PASS, result.getName() + " got successfully executed");

		// test = extent.createTest(result.getName());
		// test.log(Status.PASS, "Testcase passed is: " + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {

		test = extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());

		test.log(Status.FAIL, result.getName() + " got failed");
		test.log(Status.INFO, result.getThrowable().getMessage());

		try {
			String imgPath = new Baseclass().captureScreen(result.getName());
			test.addScreenCaptureFromPath(imgPath);

		} catch (IOException e1) {
			e1.printStackTrace();
		}

		/*
		 * test = extent.createTest(result.getName());
		 * 
		 * test.log(Status.FAIL, "Failed Testcase is : " + result.getName());
		 * test.log(Status.FAIL, "Failed Testcase cause is: " + result.getThrowable());
		 */

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		test = extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.SKIP, result.getName() + " got skipped");
		test.log(Status.INFO, result.getThrowable().getMessage());

		/*
		 * test = extent.createTest(result.getName()); test.log(Status.SKIP,
		 * "Testcase Skipped is : " + result.getName());
		 */
	}

	
	@Override
	public void onFinish(ITestContext context) {

		extent.flush();

		// String pathOfExtentReport =
		// System.getProperty("user.dir")+"\\reports\\"+repName;
		String pathOfExtentReport = System.getProperty("user.dir") + "/reports/" + repName;
		File extentReport = new File(pathOfExtentReport);

		try {
			if (Desktop.isDesktopSupported()) {
				Desktop.getDesktop().browse(extentReport.toURI());
			} else {
				System.out.println("Report generated: " + pathOfExtentReport);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		/*
		 * try { Desktop.getDesktop().browse(extentReport.toURI()); //desktop is
		 * predefined class and whatever the extent report generated will automattically
		 * open on browser } catch (IOException e) { e.printStackTrace(); }
		 */
	}

}
