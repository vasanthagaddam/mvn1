package testYenthra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanladderCss {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.urbanladder.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Close")).click();
	WebElement element = driver.findElement(By.cssSelector("div.featuredLinksBar__content "));
	Thread.sleep(2000);
	Actions action=new Actions(driver);
	action.moveToElement(element).perform();
	Thread.sleep(2000);
	List<WebElement> elements = driver.findElements(By.cssSelector("div.featuredLinksBar__content ul+ul li" ));
	System.out.println(elements.size());
	List<WebElement> innerelements = driver.findElements(By.xpath("div[id='topnav_wrapper'] ul>li>span[class='topnav_itemname']"));
	System.out.println(innerelements.size());
	
	}
	

}
