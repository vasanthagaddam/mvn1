package testYenthra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailPrimary {
	static WebDriver driver;
	public static void main(String[] args){
		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
			//WebDriver driver1=new FirefoxDriver();
			driver.get("https://mail.google.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("identifierId")).sendKeys("vasantha.rnb@gmail.com");
			driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']/following-sibling::content/descendant::span[contains(text(),Next)]")).click();
			driver.findElement(By.name("password")).sendKeys("ganesha@123");
			driver.findElement(By.xpath("//div[@class='zQJV3']/descendant::div[@id='passwordNext']/descendant::span")).click();
			WebElement primarytab = driver.findElement(By.id(":2h"));
			boolean tabselect = primarytab.isSelected();
			if(tabselect) {
				List<WebElement> emails = driver.findElements(By.xpath("//div[@class='BltHke nH oy8Mbf aE3']/descendant::div[@class='UI']/descendant::table/descendant::tr"));
				System.out.println(emails.size());
			}
			else
			{
				//String xpath="//div[@class='BltHke nH oy8Mbf aE3']/descendant::div[@class='primary aPb']/descendant::table/descendant::div[@id=':2h']/div[@class='aKp aIf-aLf']";
				driver.findElement(By.xpath("//div[@class='nH bkL']/descendant::div[@class='nH aqK']/descendant::span[@role='checkbox']")).click();
				
				List<WebElement> emails = driver.findElements(By.xpath("//div[@class='BltHke nH oy8Mbf aE3']/descendant::div[@class='UI']/descendant::table/descendant::tr"));
				System.out.println(emails.size());
			}
	}
}

