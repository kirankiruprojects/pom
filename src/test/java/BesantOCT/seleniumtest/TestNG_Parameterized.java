package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameterized {
	
	
	@Test()
	void test1()
	{
		System.out.println("smoke testing");
	}
	@Test()
	@Parameters({"UserName","Password"})
	void test2(String username ,String password)
	{
		System.out.println("username="+username);
		System.out.println("password="+password);
	}
	@Test()
	void test3()
	{
		System.out.println("smoke testing and regression testing");
	}
	

}
