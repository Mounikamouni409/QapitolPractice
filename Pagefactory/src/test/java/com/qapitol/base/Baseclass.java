package com.qapitol.base;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.qapitol.utilities.BaseTest;
import com.qapitol.utilities.ExtentReportManager;

@Listeners(com.qapitol.utilities.ExtentReportManager.class)
public class Baseclass {
	
	public Properties props;
	
	public static Logger logger;
	
	
	@BeforeClass
	@Parameters("browser")
	public void openBrowser(String browser) throws IOException {

		logger = LogManager.getLogger(Baseclass.class); // this is a class so dynamically get the class when run time

		FileReader file = new FileReader(
				System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.properties");
		props = new Properties();
		props.load(file);
		
		if (!props.containsKey("url")) {
            logger.error("URL property is missing in TestData.properties");
        }
		
		logger.info("Opening browser: " + browser);
		
		BaseTest.setDriver(browser);
		BaseTest.getDriver().get(props.getProperty("url"));
		
		logger.info("Navigated to URL: " + props.getProperty("url"));
		
		
		BaseTest.getDriver().manage().deleteAllCookies();
		BaseTest.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		BaseTest.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		
		
		
		System.out.println("Title: " + BaseTest.getDriver().getTitle());

		//driver.get(props.getProperty("url"));
		BaseTest.getDriver().manage().window().maximize();
		logger.info("Browser window maximized");
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		TakesScreenshot takesScreenshot = (TakesScreenshot) BaseTest.getDriver();
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		// Ensure screenshots directory exists
		File screenshotDir = new File(System.getProperty("user.dir") + "\\screenshots\\");
        if (!screenshotDir.exists()) {
            screenshotDir.mkdirs();
        }

		String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile = new File(targetFilePath);
		
		try {
            FileUtils.copyFile(sourceFile, targetFile);
            logger.info("Screenshot saved: " + targetFilePath);
        } catch (IOException e) {
            logger.error("Error while capturing screenshot", e);
        }

		//sourceFile.renameTo(targetFile);

		return targetFilePath;

	}
	
	@AfterClass
	public void closeBrowser() {
		logger.info("Closing browser");
		BaseTest.quitDriver();
		//driver.quit();
	}

}
