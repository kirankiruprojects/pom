package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verificationTitle_and_verifyElement {
	
	static WebDriver driver;
	
	public static void verifytitle() throws InterruptedException
	{
		driver.navigate().to("https://www.selenium.dev/documentation"); 
		driver.findElement(By.xpath("//span[.='Documentation']")).click();
		if(driver.getTitle().equals("The Selenium Browser Automation Project | Selenium ")) {
			System.out.println("Test case pass");
		}
			else {
				System.out.println("Test case fail");
			}
		driver.quit();
		}
			
	public static void 	verifyingelement()	throws InterruptedException
	{
		driver.navigate().to("https://www.selenium.dev/documentation"); 
		driver.findElement(By.xpath("//span[.='Documentation']")).click();
		boolean versionNo = driver.findElement(By.xpath("//div[.='v4.0']")).isDisplayed();
		if(versionNo)
		{
			System.out.println("test case is passs");
		}
		else 
		{
			System.out.println("test case failed");
		}
		driver.quit();
		
	}
		
		
		
		
	

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		verifytitle();
		verifyingelement();
		

	

	}

}
