package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamic {
	static WebDriver driver = new ChromeDriver();
	public static void swagbag() throws InterruptedException
	{
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@class,'form_input')]")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='password']" )).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link' and @class='bm-item menu-item']")).click();
		driver.quit();
		
	}
	static void swagbugdynamic()throws InterruptedException{
		driver.get("https://www.opencart.com");
		driver.findElement(By.xpath("//a[contains(.,'Featur')]")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//swagbag();
	swagbugdynamic();
		
		

	}

}
