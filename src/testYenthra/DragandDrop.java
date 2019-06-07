package testYenthra;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javafx.scene.paint.Color;

public class DragandDrop {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
	driver.get("https://jqueryui.com/slider/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[text()='Droppable']")).click();
	driver.switchTo().frame(0);
	
	WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
	Actions actions=new Actions(driver);
	actions.dragAndDrop(draggable,droppable).perform();
	Thread.sleep(5000);
	WebElement element = driver.findElement(By.xpath("//p[text()='Dropped!']"));
	Thread.sleep(2000);
	 String actualcolor = element.getCssValue("color");
	System.out.println(actualcolor);
	String asHex = org.openqa.selenium.support.Color.fromString(actualcolor).asHex();
	System.out.println(asHex);
	if(asHex.equals("#777620"))
	{
		System.out.println("valid color:green");
		
	}
	else
	{
		System.out.println("invalid color");
	}
	
	System.out.println(element.getText());
	Assert.assertEquals(element.getText(), "Dropped!");
	{System.out.println(" vallidated");
	}
}
}
			
			
		