package testYenthra;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hslf.util.SystemTimeUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://int.search.myway.com/");
	WebElement activeElement = driver.switchTo().activeElement();
	activeElement.sendKeys("java");
	
	WebElement java1 = driver.findElement(By.xpath("//input[@type='submit']"));
	java1.click();
	Thread.sleep(2000);
	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	int size = allLinks.size();
	System.out.println(size);
List<WebElement> ls= new ArrayList<>();
	for(WebElement link: allLinks)
	{
		if(link.getAttribute("href")!="null") {
			ls.add(link);
		}
			//System.out.println(ls);
		//	ls.size();
			
	//	}
	

		}
	System.out.println(ls.size());
	
	}

}
