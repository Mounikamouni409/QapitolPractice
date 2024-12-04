package com.qapitol.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class BaseclassforBookStore {

	public static WebDriver driver;
	
	
	@BeforeClass
	public void openBrowser() throws IOException {
		
		FileReader file = new FileReader("C:\\Users\\Qapitol QA\\eclipse-workspace\\WorkshopSelenium\\src\\test\\resources\\TestData.properties");
		Properties props = new Properties();
		props.load(file);
		
		driver = new ChromeDriver();
		//driver.get("https://www.cricbuzz.com/cricket-series/8525/womens-big-bash-league-2024/points-table");
		driver.get(props.getProperty("url2"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	 @DataProvider(name = "Sheet1")
	    public Object[][] getLoginData() throws IOException {
		 
		 String path = "C:\\Users\\Qapitol QA\\eclipse-workspace\\WorkshopSelenium\\src\\test\\java\\com\\qapitol\\utilities\\BookStore.xlsx";

		 FileInputStream file = new FileInputStream(new File(path));
	       
		 System.out.println("Sheet opened");
	       
	        XSSFWorkbook workbook = new XSSFWorkbook(file);
	        XSSFSheet sheet = workbook.getSheetAt(0);

	        int rowCount = sheet.getPhysicalNumberOfRows();
	        int colCount = sheet.getRow(1).getPhysicalNumberOfCells();

	        Object[][] data = new Object[rowCount - 1][colCount];

	        for (int i = 1; i < rowCount; i++) {
	            for (int j = 0; j < colCount; j++) {
	                data[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
	            }
	        }

	        workbook.close();
	        file.close();

	        return data;
	    }
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
