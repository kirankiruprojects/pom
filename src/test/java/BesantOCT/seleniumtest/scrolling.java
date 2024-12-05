package BesantOCT.seleniumtest;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://imresizer.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,300)");
		Robot r = new Robot();
		Thread.sleep(2000);
		r.mouseWheel(-2);
		
	}

}
