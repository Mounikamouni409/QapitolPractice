package com.qapitol.base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qapitol.utilities.BaseTest;

public class Baseclass {

	//public static WebDriver driver;
	public Properties props;
	public Logger logger;

	@BeforeClass
	@Parameters("browser")
	public void openBrowser(String browser) throws IOException {

		logger = LogManager.getLogger(this.getClass()); // this is a class so dynamically get the class when run time

		FileReader file = new FileReader(
				System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.properties");
		props = new Properties();
		props.load(file);

		/*
		 * switch (br.toLowerCase()) { case "chrome": driver = new ChromeDriver();
		 * break;
		 * 
		 * case "edge":
		 * 
		 * driver = new EdgeDriver(); break;
		 * 
		 * case "firefox":
		 * 
		 * driver = new FirefoxDriver(); break;
		 * 
		 * default:
		 * 
		 * System.out.println("Invalid Browser..."); return;
		 * 
		 * }
		 */

		BaseTest.setDriver(browser);
		BaseTest.getDriver().get(props.getProperty("url"));
		BaseTest.getDriver().manage().deleteAllCookies();
		BaseTest.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		BaseTest.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		
		
		
		System.out.println("Title: " + BaseTest.getDriver().getTitle());

		//driver.get(props.getProperty("url"));
		BaseTest.getDriver().manage().window().maximize();

	}

	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		TakesScreenshot takesScreenshot = (TakesScreenshot) BaseTest.getDriver();
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

		String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile = new File(targetFilePath);

		sourceFile.renameTo(targetFile);

		return targetFilePath;

	}

	@AfterClass
	public void closeBrowser() {
		BaseTest.quitDriver();
		//driver.quit();
	}

}
