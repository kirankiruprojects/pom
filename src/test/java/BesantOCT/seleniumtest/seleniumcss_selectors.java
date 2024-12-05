package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class seleniumcss_selectors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#email")).sendKeys("kiran");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#pass")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("._6lth")).click();
		Thread.sleep(2000);
		

	}

}
