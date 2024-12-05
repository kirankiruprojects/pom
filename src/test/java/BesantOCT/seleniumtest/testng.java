package BesantOCT.seleniumtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng {
	
	@BeforeSuite
	void beSuite() {
		System.out.println("@BeforeSuite method");
	}
	
	@BeforeClass
	void beClass() {
		System.out.println("@BeforeClass method");
	}
	
	@BeforeMethod
	void beMethod() {
		System.out.println("@BeforeMethod method");
	}
	
	@BeforeTest
	void beTest() {
		System.out.println("@BeforeTest method");
	}
	
	@Test(priority=1)
	void loginTest() {
		System.out.println("Test case 1");
	}
	
	@Test(priority=3)
	void homePageTest() {
		System.out.println("Test case 2");
	}
	
	@Test(priority=4)
	void productTest() {
		System.out.println("Test case 3");
	}
	
	@Test(priority=2)
	void cartTest() {
		System.out.println("Test case 4");
	}
	
	
	@AfterTest
	void AfTest() {
		System.out.println("@AfterTest method");
	}
	
	@AfterMethod
	void AfMethod() {
		System.out.println("@Aftermethod method");
	}
	
	@AfterClass
	void AfClass() {
		System.out.println("@AfterClass method");
	}
	
	@AfterSuite
	void AfSuite() {
		System.out.println("@AfterSuite method");
	}
	
}