package BesantOCT.seleniumtest;

import org.testng.annotations.Test;

public class TestNG_Parallel {
	@Test(groups= {"smoke"})
	void test1()
	{
		System.out.println("smoke testing");
	}
	@Test(groups= {"Regression"})
	void test2()
	{
		System.out.println("Regression testing");
	}
	@Test(groups= {"smoke,Regression"})
	void test3()
	{
		System.out.println("smoke testing and regression testing");
	}

}
