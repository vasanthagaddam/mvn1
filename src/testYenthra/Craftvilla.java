package testYenthra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Craftvilla {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.craftsvilla.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	  List<WebElement> mainMenu = driver.findElements(By.xpath("//nav[@id='mega-menu']/div/ul/li/a[not(@class='fs14')]"));
	  System.out.println(mainMenu.size());
	  Actions action=new Actions(driver); 
	 for(WebElement superMenu:mainMenu)
	 {
	  String textobj=superMenu.getText();
		System.out.println(superMenu.getText());
	  action.moveToElement(superMenu).perform();
	  Thread.sleep(2000);
	  List<WebElement> submenu = driver.findElements(By.xpath("//li/a[contains(text(),"+textobj+")]/parent::li/div/div[@class='container-fluid sub-menu-wrapper']/ul/li/a"));
	  Thread.sleep(2000);
	  
	  System.out.println(submenu.size());
	 // System.out.println(submenu.size());
	  for(WebElement submenus:submenu)
	 {
		// String submenustext=submenus.getText();
		// System.out.println(submenustext);
		  String submenustext=submenus.getText();
			 System.out.println(submenustext);
			
	 }
	 }
	}
}
	 
	

