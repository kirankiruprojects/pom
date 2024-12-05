package BesantOCT.seleniumtest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import main.pages.LoginPage;

public class pom_login_Test {
	
	WebDriver driver;
	LoginPage loginpage;
	
	@BeforeMethod
	void setup()	
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		loginpage =new LoginPage(driver);
	}
	
	@Test
	void titleTest()
	{
		String expectedTitle ="Swag Labs";
		org.testng.Assert.assertEquals(loginpage.getTitleofPage(), expectedTitle);
	}
	@Test
	void validloginTest()
	{
		loginpage.login("standard_user", "secret_sauce");
		org.testng.Assert.assertTrue(driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']")).isDisplayed());
	}
	@Test
	void invalidLoginTest()
	{
		loginpage.login("standard_user", "secret_sauce1");
		String expectederror="Epic sadface: Username and password do not match any user in this service";
		org.testng.Assert.assertEquals(loginpage.getError(), expectederror);
	}
	@Test
	void emptyLogin()
	{
		loginpage.loginbtnclick();
		String expectedresult = "Epic sadface: Username is required";
		org.testng.Assert.assertEquals(loginpage.getError(), expectedresult);
	}
	@AfterMethod
	void tearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}
	
	
	}


