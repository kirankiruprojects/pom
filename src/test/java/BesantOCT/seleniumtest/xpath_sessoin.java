package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_sessoin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='password']" )).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	}

}
