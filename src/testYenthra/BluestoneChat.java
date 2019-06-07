package testYenthra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneChat {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.bluestone.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(3000);
	WebElement iframe = driver.findElement(By.xpath("//iframe[@id='livechat-compact-view']"));
	driver.switchTo().frame(iframe);
	driver.findElement(By.id("open-label")).click();
	driver.switchTo().defaultContent();
	//Thread.sleep(2000);
	WebElement chatboxfullview = driver.findElement(By.xpath("//iframe[@id='livechat-full-view']"));
	driver.switchTo().frame(chatboxfullview);
	Thread.sleep(3000);
	driver.findElement(By.id("name")).sendKeys("vasantha");
			//driver.switchTo().activeElement().sendKeys("vasantha");
	Thread.sleep(3000);
	//driver.findElement(By.id("email"));
	driver.findElement(By.name("email")).sendKeys("vasantha.rnb@gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.id("container_4_4")).sendKeys("8886785107");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	WebElement textbox = driver.findElement(By.xpath("//span[@id='textarea-wrapper']/textarea"));
	textbox.sendKeys("hi iam in BLuestone");

//	WebElement message = driver.findElement(By.xpath("//*[@id='message-placeholder']"));

	
	
	
	}
	}


