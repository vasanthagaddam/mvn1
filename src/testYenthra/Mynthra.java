package testYenthra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mynthra {
	static WebDriver driver;
	static String xpath1;
	String xpath2;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com");
	xpath1="//nav[@class='desktop-navbar']/descendant::div[@class='desktop-navLink']";
	
	List<WebElement> mainMenu = driver.findElements(By.xpath(xpath1));
System.out.println(mainMenu.size());
Thread.sleep(2000);
Actions action=new Actions(driver);
for(WebElement menu:mainMenu)
{
	action.moveToElement(menu).perform();
	String text = menu.getText();
	System.out.println(text);	
}
	
for(WebElement menu:mainMenu)
{
	
 List<WebElement> submenu = driver.findElements(By.xpath(xpath1+"/a[.='Men']/following-sibling::div/descendant::a[@class='desktop-categoryName']"));
	System.out.println(submenu.size());
	for(WebElement submenus:submenu)
	{
		action.moveToElement(submenus).perform();
		String text = submenus.getText();
		System.out.println(text);
		

		
	}
	
	
}
}
}
