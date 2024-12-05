package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[.='Elements']/following-sibling::div[1]")).click();
	Thread.sleep(3000);
	String title = driver.getTitle();
	System.out.println(title);
	if(driver.getTitle().equals(title))
	{
		System.out.println(" teast case pass");
	}
	else
	{
		System.out.println("test case fail");
	}
	//driver.quit();

	}
	

}
