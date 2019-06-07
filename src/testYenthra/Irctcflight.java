package testYenthra;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Irctcflight {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("http://www.irctc.com/displayServlet");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String xpath="//div[@class='main-left-column']/descendant::div[@class='left-column-subunit']/following::img[@src='img/TourismAirbanner1.jpg']";
	driver.findElement(By.xpath(xpath)).click();
	//driver.switchTo().activeElement();
	driver.findElement(By.cssSelector("[id='stationFrom']")).click();  
	//Actions action =new Actions(driver);
	driver.findElement(By.xpath("//ul[@id='ui-id-1']/descendant::li/descendant::div[contains(text(),'Bengaluru (BLR)')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("[id='stationTo']")).click();  
	driver.findElement(By.xpath("//ul[@id='ui-id-2']/li/descendant::div[contains(text(),'Mumbai (BOM)')]")).click();
	driver.findElement(By.xpath("//div[@id='Departure-Date']/descendant::div[@class='input-group ']/input[@id='originDate']"));
	
	LocalDate ld=LocalDate.now();
	System.out.println(ld);

	System.out.println(	"******ADD DAYS******"+ld.plusDays(50));
	//System.out.println("-----MINUS DAYS-----"+ld.minusDays(463));
	String xpath1="//div[@class='datepicker datepicker-dropdown datepicker-left datepicker-bottom rdeparturedate']/descendant::div[@class='date-table-right']/descendant::table/descendant::tr[@class='active']/descendant::td/descendant::span[text()='June']";

String xpath2="//div[@class='datepicker-days']/descendant::table/descendant::tbody/descendant::tr/following-sibling::tr/following::tr/descendant::td/descendant::span[contains(text(),'15')]";

driver.findElement(By.xpath(xpath1)).click();
	
	
	
	}
	

}
