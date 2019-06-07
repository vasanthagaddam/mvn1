package testYenthra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Listcheck {
	public static void main(String[] args) throws InterruptedException {
		String[] expstr={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
//	Select s=new Select(driver.findElement(By.xpath("//div[@id='u_0_w']/descendant::span[@data-type='selectors']/descendant::span/descendant::select[@id='month']")));
	//Thread.sleep(2000);
	Select s=new Select(driver.findElement(By.xpath("//div[@id='u_0_w']/descendant::span[@data-type='selectors']/descendant::span/descendant::select[@id='month']/descendant::option[text()='Month']")));
	Thread.sleep(2000);	
	
	List<WebElement> alloptions = s.getOptions();
	System.out.println(alloptions.size());
	System.out.println("***options are mentioned below***");
	for(WebElement option:alloptions){
		String text = option.getText();
		System.out.println(text);
	}
	/*int expectedstrlen = (expstr.length);	
	
	
	if(expectedstrlen==listelem.size())
	{
		System.out.println("the elements are present");
	}*/
	/*List explst=new ArrayList(Arrays.asList(expstr));
	System.out.println("expected values"+explst);
	ArrayList<String> actuallist=new ArrayList<String>();
	for(WebElement option:alloptions)
	{String text=option.getText();
	System.out.println(text);
	actuallist.add(text);
	}
	Collections.sort(actuallist);
	System.out.println(actuallist);
	
	Collections.sort(explst);
	System.out.println(explst);
	*/

	
	
	
	
	
	
	}
	}
