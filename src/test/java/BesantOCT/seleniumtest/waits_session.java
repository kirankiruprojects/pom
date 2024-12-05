package BesantOCT.seleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits_session {
	static WebDriver driver;
	
	public static void implicit()
	{
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Nexus 6")).click();
		
	}
	public static void emplicit()
	{
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.id("timerAlertButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
				
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//implicit();
		emplicit();

	}

}
