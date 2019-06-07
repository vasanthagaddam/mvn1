package testYenthra;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BRlinks {
	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("C://Users//RUKKUSADHU//Desktop//htmlsource//brokenlinksdemo.html");
WebElement link1= driver.findElement(By.xpath("//a[.='RESTFULL services testing']"));

	
String link=link1.getAttribute("href");
URL u = new URL(link);
HttpURLConnection connection =(HttpURLConnection)u.openConnection();
int Rcode=connection.getResponseCode();
if(Rcode==200)
{
	System.out.println(Rcode);
 System.out.println(connection.getResponseMessage());
 System.out.println("link is not broken");

}
else
{
	System.out.println(Rcode);

System.out.println(connection.getResponseMessage());
System.out.println("link is  broken");

}
	
	}
	
}
