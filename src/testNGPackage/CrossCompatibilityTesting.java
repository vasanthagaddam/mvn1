package testNGPackage;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossCompatibilityTesting {
static
{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		
}
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void runInMultiplebrowsers(String browser) throws InterruptedException{
	if(browser.equals("Firefox"))
	{
	//	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else
		//if(browser.equals("Chrome"))
	{
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 driver= new ChromeDriver();
		
	}
	driver.get("http://rukkusadhu-pc/login.do");
	WebElement unTB= driver.findElement(By.name("username")); 
	for(int i=1;i<=5;i++){
		unTB.sendKeys("admin -->"+i);
	Thread.sleep(2000);
	unTB.clear();
}
driver.close();
	}
}
