package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_examples {
	
	public static void application1() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2F"
				+ "www.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid"
				+ ".net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid"
				+ ".mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2."
				+ "0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("7899281642");
		Thread.sleep(2000);
		driver.findElement(By.className("a-button-input")).click();	
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ap_password")).sendKeys("Kiran123#");
		Thread.sleep(2000);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='hmenu-item' and @href='javascript:void(0)']")).click();
		driver.quit();
	}
	public static void application2() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
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
		Thread.sleep(3000);
		driver.quit();	
	}	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		application1();
		application2();
		
		

	}

}
