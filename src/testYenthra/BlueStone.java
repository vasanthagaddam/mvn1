package testYenthra;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("https://www.bluestone.com/");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Diamondrings");
driver.findElement(By.xpath("//input[@class='button']")).click();
System.out.println("DIAMOND RINGS IMAGES ARE DISPLAYED");
driver.findElement(By.xpath("//div[@class='p-image']/a/img[@alt='The Amla Ring']")).click();
driver.findElement(By.xpath("//div[@class='select-size']/span"));
driver.findElement(By.xpath("//input[@id='buy-now']")).click();
driver.findElement(By.xpath("//div[@class='formErrorContent']"));
Alert alertobj = driver.switchTo().alert();
  String actualtext = alertobj.getText();
  System.out.println(actualtext);
 
if(actualtext.equals("* This field is required")){
	alertobj.accept();
}
}
}


