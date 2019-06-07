package testYenthra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Blusestonekada1 {static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("https://www.bluestone.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement alljewl = driver.findElement(By.xpath("//*[@title='Jewellery']"));


 Actions actions=new Actions(driver);
 Thread.sleep(2000);
	actions.moveToElement(alljewl).click().build().perform(); 
	String xpath="//*[@id='main']/header/div/div[2]/div/nav/ul/li[6]/div/ul/li[1]/div/ul/li[6]/a";
	WebElement elekada = driver.findElement(By.xpath(xpath));
	System.out.println(elekada.getText());
    actions.moveToElement(elekada).click().build().perform();
	Thread.sleep(3000);
	String xpath1="//*[@id='main']/header/div/div[2]/div/nav/ul/li[6]/div/ul/li[1]/div/ul/li";
	List<WebElement> listele = driver.findElements(By.xpath(xpath1));
	int size = listele.size();
	System.out.println(size);
//	for(WebElement element:listele)
	//{if(element.getText().equals(elekada.getText())){
		//System.out.println(true);

	
	

}
}




