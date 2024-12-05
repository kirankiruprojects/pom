package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh_forward_backward {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[.='Elements']/following-sibling::div[1]")).click();
		Thread.sleep(3000);
		boolean textdisplay = driver.findElement(By.xpath("//div[.='Please select an item from left to start practice.']")).isDisplayed();
		if(textdisplay)
		{
			System.out.println(" teast case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.quit();

	}

}
