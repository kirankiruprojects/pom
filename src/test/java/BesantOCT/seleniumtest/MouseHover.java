package BesantOCT.seleniumtest;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips");
	   WebElement button=driver.findElement(By.id("toolTipButton"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",button);
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(button);
		act.perform();
		Thread.sleep(3000);
		
	
		
		
		
		

	}

}
