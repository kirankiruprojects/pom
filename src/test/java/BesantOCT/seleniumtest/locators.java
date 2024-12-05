package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {	

		WebDriver driver = new ChromeDriver();
		driver.get("C:/Users/IPG A4IN/OneDrive/Documents/NOTES/Besanth/JAVA NOTES/seleniumlocators.html");
		driver.manage().window().maximize();
		WebElement link = driver.findElement(By.tagName("a"));
		Thread.sleep(3000);
		link.click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
