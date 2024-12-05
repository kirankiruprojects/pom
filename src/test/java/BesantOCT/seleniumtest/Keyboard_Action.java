package BesantOCT.seleniumtest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_Action {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com");
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='password']" )).sendKeys("secret_sauce");
			Thread.sleep(2000);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			r.mouseWheel(4);
			Thread.sleep(2000);
			r.mouseWheel(-3);
			

	}

}
