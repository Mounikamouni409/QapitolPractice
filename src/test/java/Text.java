import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qaptiol.base.Baseclass;

public class Text{
//	WebDriver driver;
//	public Text(WebDriver driver)
//	
//	{
//		this.driver=driver;
//		
//	}
	@Test
	public void text5() {
		WebDriver driver=new ChromeDriver() ;
		
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='avatar mx-auto white']"))));
		driver.findElement(By.xpath("//div[@class='avatar mx-auto white']")).click();
		driver.findElement(By.id("item-0")).click();
	
		driver.findElement(By.xpath("//input[@class=' mr-sm-2 form-control']")).sendKeys("Mounica");
			
			
			
			
		}
	
		
		
	}


