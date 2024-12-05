package BesantOCT.seleniumtest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindow_handles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		Thread.sleep(1000);
		WebElement links = driver.findElement(By.id("simpleLink"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",links);
		links.click();
		System.out.println(driver.getWindowHandle());
		
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> values = handle.iterator();	
		
		String parentwindow = values.next();
		System.out.println(driver.getTitle());
		
		String childwindow = values.next();
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
		

	}

}
