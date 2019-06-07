package testYenthra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladder  {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.urbanladder.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Close")).click();
	driver.findElement(By.xpath("//div[@class='taxonNavigation']"));
	
  List<WebElement> mainMenu = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li/span"));
  Actions action=new Actions(driver); 
  for(WebElement subMenu:mainMenu){
	  String textobj=subMenu.getText();
	  System.out.println(textobj);
	 action.moveToElement(subMenu).perform();
	  Thread.sleep(2000);
	  String xpath="//div[@id='tapnav_wrapper']/ul/li[@class='tapnav_item'+textobj+unit]//span";
	 // https://www.urbanladder.com"
	  List<WebElement> subElements = subMenu.findElements(By.xpath(xpath));
	  for(WebElement eleobj:subElements){
		  String elements = eleobj.getText();
		  System.out.println(elements);
  }
		  
	  } 

	}
	}
