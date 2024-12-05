package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmation_popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver	driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/alerts");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,300)");
		WebElement cnfm_btn = driver.findElement(By.id("confirmButton"));
		cnfm_btn.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

	}

}
