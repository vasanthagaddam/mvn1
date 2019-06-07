package testYenthra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaillogin {
static WebDriver driver;
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("vasantha.rnb@gmail.com");
		driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']/following-sibling::content/descendant::span[contains(text(),Next)]")).click();
		driver.findElement(By.name("password")).sendKeys("ganesha@123");
		driver.findElement(By.xpath("//div[@class='zQJV3']/descendant::div[@id='passwordNext']/descendant::span")).click();
		
		//driver.findElement(By.xpath("//div[@class='z0']/descendant::div[@role='button']")).click();
}
}
