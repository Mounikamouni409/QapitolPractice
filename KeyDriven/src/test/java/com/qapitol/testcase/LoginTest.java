package com.qapitol.testcase;

import java.io.IOException;
import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.qapitol.KeyEngine.KeyEngine;

public class LoginTest {
	
	KeyEngine keyEngine;

    ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");

   public final static Logger logger = LogManager.getLogger(LoginTest.class);
    @BeforeTest
    public void setUp() {

        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Keyword Driven Framework");
        extent.attachReporter(spark);

        keyEngine = new KeyEngine();
    }

    @Test
    public void loginTest() throws IOException {
        ExtentTest test = extent.createTest("Login Linkendin Application").assignAuthor("Mayuresh")
                .assignCategory("Automation Test").assignDevice("Window");

        test.info("Initilization Login Functionality");

        String filePath = "C:\\Users\\Qapitol\\Desktop\\login\\Book1.xlsx";
        logger.debug("Executed login test");
        test.info("Executed login test");
        keyEngine.service(filePath);
    }

    @AfterTest
    public void afterTest() throws IOException {

        extent.flush();
        keyEngine.tearDown();
    }

}
