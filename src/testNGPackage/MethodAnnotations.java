package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodAnnotations {

	public WebDriver driver;
	@BeforeMethod
	public void googlepage()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://www.google.com/");			
		System.out.println("in google page");
	}
	@Test
	public void enter()
	{
System.out.println(" test");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nuakri");
	}
	@AfterMethod
	public void closepage()
	{
		System.out.println("close the browser");
		driver.close();
	}

}
