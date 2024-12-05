package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorslink_partial_link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		// driver.findElement(By.linkText("Forgotten password")).click();
	
		driver.findElement(By.partialLinkText("Forgot")).click();

	}

}
