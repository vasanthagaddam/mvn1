package testYenthra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Move;

public class jqueryui {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
	driver.get("https://jqueryui.com/slider/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
	Actions actions=new Actions(driver);

int nofpixeltomove=30;
for (int i=0;i<=nofpixeltomove;i++)
{
//actions.moveToElement(slider).clickAndHold().moveByOffset(0, 500).release().perform();
	actions.dragAndDropBy(slider, i, 30).build().perform();
}
/*WebElement slider1 = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
//Actions actions1=new Actions(driver);*/

for(int i=nofpixeltomove;i>=0;i--)
{
	actions.dragAndDropBy(slider, i, 20).build().perform();
}
	
	
	
	}	
}
