package testYenthra;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink2 {
	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("C://Users//RUKKUSADHU//Desktop//htmlsource//brokenlinksdemo.html");
 List<WebElement> elements = driver.findElements(By.xpath("//a"));
 System.out.println(elements.size());

for(WebElement link:elements)
{

URL u = new URL(link.getAttribute("href"));
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
	


}
