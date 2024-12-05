package BesantOCT.seleniumtest;

import org.testng.annotations.Test;

public class TestNG_Enable_Disable {
	
	@Test(enabled=true)
	void test1()
	{
		System.out.println("smoke testing");
	}
	@Test()
	void test2()
	{
		System.out.println("Regression testing");
	}
	@Test(enabled=false)
	void test3()
	{
		System.out.println("smoke testing and regression testing");
	}
}
