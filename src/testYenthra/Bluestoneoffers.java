package testYenthra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestoneoffers {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.bluestone.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement offerelement = driver.findElement(By.xpath("//a[text()='Offers ']"));
	
	Thread.sleep(2000);
	Actions actions=new Actions(driver);
	actions.moveToElement(offerelement).perform();
	driver.findElement(By.xpath("//span[text()='Flat 5% Off']")).click();
	System.out.println("print the product list");
	 List<WebElement> productlist = driver.findElements(By.xpath("//*[@id='product_list_ui']/li"));
	 System.out.println(productlist.size());
	for(WebElement products:productlist)
	{System.out.println(products.getText());
		
	}
	}
	
}