package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testNG_example {

	public class TestNG4 {

		static WebDriver driver;
		static String result;
		static String testResult;

		String validate() {
			try {
				driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
				result = "Success";
			} catch (Exception e) {
				result = "Failed";
			}
			return result;
		}

		@BeforeMethod
		void launchBrowser() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
		}

		@Test
		void validLogin() {
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
			testResult = "Success";
			Assert.assertEquals(validate(), testResult);

		}

		@Test
		void invalidUserNameLogin() {
			driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			testResult = "Failed";
			Assert.assertEquals(validate(), testResult);
			
		}

		@Test
		void invalidPasswordLogin() {
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret");
			driver.findElement(By.id("login-button")).click();
			testResult = "Failed";
			Assert.assertEquals(validate(), testResult);
		}

		@AfterMethod
		void teardown() {
			if (driver != null) {
				driver.quit();
			}
		}
		
}
}