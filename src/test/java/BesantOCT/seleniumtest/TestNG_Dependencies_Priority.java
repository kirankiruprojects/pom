package BesantOCT.seleniumtest;

import org.testng.annotations.Test;

public class TestNG_Dependencies_Priority {
	
	
	@Test(groups= {"smoke"})
	void test1()
	{
		System.out.println("smoke testing");
	}
	@Test(groups= {"Regression"},dependsOnMethods = {"test1"})
	void test2()
	{
		System.out.println("Regression testing");
	}
	@Test(groups= {"smoke,Regression"},dependsOnGroups = {"Regression"})
	void test3()
	{
		System.out.println("smoke testing and regression testing");
	}

}
