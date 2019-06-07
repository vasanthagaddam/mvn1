package testYenthra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.ui.Robot;

public class Gmailcomposebutton {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("identifierId")).sendKeys("vasantha.rnb@gmail.com");
	driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']/following-sibling::content/descendant::span[contains(text(),Next)]")).click();
	driver.findElement(By.name("password")).sendKeys("ganesha@123");
	driver.findElement(By.xpath("//div[@class='zQJV3']/descendant::div[@id='passwordNext']/descendant::span")).click();
	driver.findElement(By.xpath("//div[@class='z0']/descendant::div[@role='button']")).click();
	driver.findElement(By.name("to")).sendKeys("vasantha.rnb@gmail.com");
	driver.findElement(By.name("subjectbox")).sendKeys("hai");
	driver.findElement(By.xpath("//div[@class='aDh']/child::table/descendant::div[@class='dC']/descendant::div")).click();
	
	
	
	
	
	
	
/*	
	
 WebElement prielement = driver.findElement(By.xpath("//div[@id=':4']/following-sibling::div/descendant::div[@class='aKh aPb']/descendant::div[@class='aAy J-KU-KO aIf-aLe']"));
 Thread.sleep(2000);
			boolean selected=prielement.isSelected();
	
if(selected)

	{
	System.out.println(prielement.getText());
	}
else
	System.out.println("not selected");
	}
*/	
	}
	}
