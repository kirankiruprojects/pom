package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_id_name_class {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("kiran");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("ftydyfht");
		Thread.sleep(2000);
		WebElement login =driver.findElement(By.className("_acas"));
		login.click();
		
	}

}
