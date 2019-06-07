package testYenthra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestonekada {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.bluestone.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='main']/header/div/div[2]/div/nav"));
// List<WebElement> mainMenu = driver.findElements(By.xpath("//*[@id='main']/header/div/div[2]/div/nav/ul/li"));
// System.out.println(mainMenu.size());
 Thread.sleep(2000);
 //WebElement alljewl = driver.findElement(By.xpath("//*[@title='Jewellery']"));
// System.out.println(alljewl.getText());
//for(WebElement allele:mainMenu)
 
	WebElement alljewl = driver.findElement(By.xpath("//*[@title='Jewellery']"));
 
	//if(allele.getText().equals(alljewl)){
 
	 Actions actions=new Actions(driver);
	 Thread.sleep(2000);
 	actions.moveToElement(alljewl).perform();                                                                                                 
	//driver.findElement(By.xpath("//input[@class='button']")).click();
	
 
	}
 }

	
