package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_testcases {
	 static WebDriver driver;
	 
	 
	 public static void testcase1() throws InterruptedException {
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com");
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='password']" )).sendKeys("secret_sauce");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='login-button']")).click();
			Thread.sleep(2000);
			driver.close();
		 
	 }
	 public static void invalid() throws InterruptedException {
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com");
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='password']" )).sendKeys("hjfgeyjdgjk");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='login-button']")).click();
			Thread.sleep(2000);
			driver.close();
		 
	 }
	 public static void invalidpassword() throws InterruptedException {
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com");
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='password']" )).sendKeys("hjfgeyjdgjk");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='login-button']")).click();
			Thread.sleep(2000);
			driver.close();
		 
	 }
	 public static void invalidusername() throws InterruptedException {
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com");
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='password']" )).sendKeys("secret_sauce");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='login-button']")).click();
			Thread.sleep(2000);
			driver.close();
		 
	 }
	 public static void emptyfeilds() throws InterruptedException {
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com");
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='password']" )).sendKeys("");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='login-button']")).click();
			Thread.sleep(2000);
			driver.close();
		 
	 }
	 public static void onlyuserfeilds() throws InterruptedException {
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com");
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='password']" )).sendKeys("");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='login-button']")).click();
			Thread.sleep(2000);
			driver.close();
		 
	 }
	 public static void onlypasswordfeilds() throws InterruptedException {
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com");
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='password']" )).sendKeys("secret_sauce");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='login-button']")).click();
			Thread.sleep(2000);
			driver.close();
		 
	 }
	 public static void emptycart() throws InterruptedException {
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com");
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='password']" )).sendKeys("secret_sauce");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='login-button']")).click();
			Thread.sleep(2000);
		//	driver.close();
			driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
			Thread.sleep(2000);
			driver.close();
		 
	 }
	 public static void addproduct() throws InterruptedException {
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
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(2000);
		driver.close();
	 }
	 public static void lowtohigh() throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='password']" )).sendKeys("secret_sauce");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='login-button']")).click();
			Thread.sleep(3000);
			driver.findElement(By.className("product_sort_container")).click();
			Thread.sleep(2000);
			driver.close();
	 }
	 public static void continue_shopping() throws InterruptedException {
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
			driver.findElement(By.id("continue-shopping")).click();
			Thread.sleep(3000);
			driver.close();
			
			
		 }
	 public static void add_multiple() throws InterruptedException {
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
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("continue-shopping")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		//	driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
			driver.close();
			
			
			
		 }
	 public static void add_removing_product() throws InterruptedException {
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
			
			driver.findElement(By.id("remove-sauce-labs-backpack")).click();
			Thread.sleep(3000);
			driver.close();
		 }
	 public static void login_and_logout()throws InterruptedException {
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com");
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='password']" )).sendKeys("secret_sauce");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='login-button']")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@id='logout_sidebar_link' and @class='bm-item menu-item']")).click();
			Thread.sleep(3000);
			driver.close();
	 
	 }
	 public static void logout_adding() throws InterruptedException {
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com");
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='password']" )).sendKeys("secret_sauce");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='login-button']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@id='logout_sidebar_link' and @class='bm-item menu-item']")).click();
			Thread.sleep(3000);
			driver.close();
	 
	 }
	 

	public static void main(String[] args) throws InterruptedException {
		testcase1();
		invalid();
		invalidpassword();
		invalidusername();
		emptyfeilds();
		onlyuserfeilds();
		onlypasswordfeilds();
		addproduct();
		lowtohigh();
		continue_shopping();
		add_multiple();
		emptycart();
		add_removing_product();
		login_and_logout();
		logout_adding();

	}

}

