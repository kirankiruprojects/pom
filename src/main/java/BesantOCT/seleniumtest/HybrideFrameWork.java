package BesantOCT.seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import main.pages.LoginPage;

public class HybrideFrameWork {
	
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

}
