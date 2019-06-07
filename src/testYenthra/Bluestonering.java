package testYenthra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestonering {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.bluestone.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
WebElement ringelement = driver.findElement(By.xpath("//a[@title='Rings']"));	
	Thread.sleep(2000);
	Actions actions=new Actions(driver);
	actions.moveToElement(ringelement).perform();
	driver.findElement(By.xpath("//a[@title='Diamond Rings']")).click();
	//List<WebElement> defaultringlist = driver.findElements(By.xpath("//div[@id='grid-view-result']"));
	//int size = defaultringlist.size();
	//System.out.println(size);
//	for(WebElement rings:defaultringlist){
	//	System.out.println(rings.getText());
//	}
	
	WebElement sortbyele= driver.findElement(By.xpath("//section[@class='block sort-by pull-right']"));
    //Thread.sleep(2000);
	actions.moveToElement(sortbyele).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='view-sort-by']/div[3]/a")).click();
	
	
	}
	
	

}
