package BesantOCT.seleniumtest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_practice {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement searching = driver.findElement(By.name("q"));
		searching.sendKeys("Men Striped Round Neck Polyester Dark Green T-Shirt");
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		//r.mouseWheel(4);
		WebElement productsearch = driver.findElement(By.linkText("Men Striped Round Neck Polyester Dark Green T-Shirt"));
		
	 //
	 //	productsearch.click();
	 //JavascriptExecutor js= (JavascriptExecutor) driver;
	//  js.executeScript("arguments[0].scrollIntoView(true);",productsearch);
	//  Thread.sleep(2000);
	        productsearch.click();
	}

}
