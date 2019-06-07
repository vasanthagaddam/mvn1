package testYenthra;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabnavigation {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Robot rb=new Robot();
	driver.findElement(By.cssSelector("body"));
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_T);
	int tabcount = driver.getWindowHandles().size();
	//System.out.println(wh.size());
	ArrayList<String> lst=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(lst.get(1));
	driver.get("https://www.facebook.com");
	for(int i=0;i<=tabcount-1;i++)
	{		
	driver.switchTo().window(lst.get(i));
	System.out.println(driver.getCurrentUrl());
   // driver.get("https://www.google.com");
	}
	
	driver.quit();
	}
}

