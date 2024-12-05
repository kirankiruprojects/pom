package BesantOCT.seleniumtest;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemoqaProject {
	static WebDriver driver;
	
	public static void Elements() throws AWTException, InterruptedException
	{
		 driver.navigate().to("https://demoqa.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebElement elements = driver.findElement(By.xpath("//div/div/h5[.='Elements']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",elements);
		Thread.sleep(2000);
		elements.click();
		Thread.sleep(2000);
		driver.findElement(By.className("text")).click();
		
		WebElement username=driver.findElement(By.id("userName"));
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);",username);
		username.sendKeys("kiran");
		Thread.sleep(2000);
		driver.findElement(By.id("userEmail")).sendKeys("kiran123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("currentAddress")).sendKeys("bangalore\n rajajinagar");
		Thread.sleep(1000);
		driver.findElement(By.id("permanentAddress")).sendKeys("mysore");
		Thread.sleep(1000);
		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
		Thread.sleep(2500);
		
		
		
	}
	public static void checkox() throws InterruptedException
	{
		driver.get("https://demoqa.com/checkbox");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebElement expend = driver.findElement(By.xpath("//button[@title='Expand all']"));
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);",expend);
		expend.click();
		driver.findElement(By.className("rct-checkbox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Documents']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Collapse all']")).click();
		Thread.sleep(2000);
	}
	public static void PracticeForm() throws InterruptedException, AWTException
	{
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebElement form = driver.findElement(By.id("firstName"));
		JavascriptExecutor pf = (JavascriptExecutor) driver;
		pf.executeScript("arguments[0].scrollIntoView(true);",form);
		Thread.sleep(2000);
		form.sendKeys("kiran");;
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("B S");
		Thread.sleep(1000);
		driver.findElement(By.id("userEmail")).sendKeys("kiran@gmail.com");
		Thread.sleep(1000);
		WebElement radio = driver.findElement(By.xpath("//label[.='Male']"));
		radio.click();
		
		driver.findElement(By.id("userNumber")).sendKeys("7899251642");
		Thread.sleep(1000);
		WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
		//dob.submit();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("SoftwareTesting");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[.='Sports']")).click();
		Thread.sleep(1000);
		 WebElement fileInput = driver.findElement(By.id("uploadPicture"));
	        fileInput.sendKeys("C:/Users/IPG A4IN/OneDrive/Documents/kiran phone/Pictures/punith.jpg");
		Thread.sleep(1000);
		driver.findElement(By.id("currentAddress")).sendKeys("bangalore\n rajajinagar");
		Thread.sleep(1000);
		JavascriptExecutor pff = (JavascriptExecutor) driver;
		pff.executeScript("scrollBy(0,300)");
		driver.findElement(By.id("state")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='NCR']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("city")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='Delhi']")).click();
		Thread.sleep(1000);
		
		Thread.sleep(2000);
	
		driver.findElement(By.id("submit")).click();	
		
	}
	public static void slider() throws InterruptedException
	{
		driver.get("https://demoqa.com/slider");
		
		WebElement slid = driver.findElement(By.id("sliderContainer"));
		int slidwidth = slid.getSize().width;
		Actions act = new Actions(driver);
		act.clickAndHold(slid).moveByOffset(50,0).release();
		Thread.sleep(2000);
		act.clickAndHold(slid).moveByOffset(0,50).release();
		act.perform();
	}
	public static void Alerts() throws InterruptedException
	{
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		JavascriptExecutor pff = (JavascriptExecutor) driver;
		pff.executeScript("scrollBy(0,400)");
		WebElement alertss = driver.findElement(By.id("alertBtn"));
		alertss.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		WebElement alerts = driver.findElement(By.id("confirmBtn"));
		alerts.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		WebElement passkey = driver.findElement(By.id("promptBtn"));
		passkey.click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("hi im kiran");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='New Tab']")).click();
		System.out.println("new tab web page :=  "+driver.getTitle());
		Thread.sleep(2000);
		
		driver.findElement(By.id("PopUp")).click();
		Set<String> multiwindow = driver.getWindowHandles();
		Iterator<String> value = multiwindow.iterator();
		
		String parentwindow = value.next();
		System.out.println("pop up window parent page :=  "+driver.getTitle());
		String childwindow = value.next();
		driver.switchTo().window(childwindow);
		System.out.println("childwindow1 page :=  "+ driver.getTitle());
		
		String childw2 =value.next();
		driver.switchTo().window(childw2);
		System.out.println("childwindow3 page :=  "+driver.getTitle());
		
		String childw3 =value.next();
		driver.switchTo().window(childw3);
		System.out.println("childwindow3 page :=  "+driver.getTitle());	
	
		
	}
	
	public static void actions() throws InterruptedException
	{
		driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		WebElement pointmebtn = driver.findElement(By.className("dropbtn"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",pointmebtn);
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(pointmebtn);
		act.perform();
		Thread.sleep(2000);
		
		WebElement dobleclick = driver.findElement(By.xpath("//button[.='Copy Text']"));
		act.doubleClick(dobleclick);
		act.perform();
		Thread.sleep(2000);
		
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		act.dragAndDrop(draggable, droppable);
		act.perform();
		Thread.sleep(2000);
		
		
		
	}
	public static void select() throws InterruptedException
	{
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement colorsSelect = driver.findElement(By.id("colors"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);",colorsSelect);
		JavascriptExecutor pff = (JavascriptExecutor) driver;
		pff.executeScript("scrollBy(0,700)");
		Thread.sleep(2000);
		colorsSelect.click();
		Thread.sleep(2000);
		
		
		Select s =new Select(colorsSelect);
		List<WebElement> alllist = s.getOptions();
		for(WebElement options :alllist)
		{
			System.out.println("selectable options are :="+options.getText());
		}
		s.selectByIndex(2);
		
		
		WebElement country = driver.findElement(By.id("country"));
		country.click();
		Select ss= new Select(country);
		ss.selectByIndex(9);
		Thread.sleep(2000);
		
		
		
	}
	public static void robotactions() throws AWTException, InterruptedException
	{
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement seraching = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		seraching.sendKeys("games");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		
	}
	
	
	


	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		 Elements();
		checkox();
		PracticeForm();
		slider();
		 Alerts();
		 actions();
		 select();
		 robotactions();

	}

}
