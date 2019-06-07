package testYenthra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragTarget {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	//launch the Fire fox browser
WebDriver driver = new FirefoxDriver();
Thread.sleep(2000);
driver.get("https://jqueryui.com/droppable/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.linkText("Droppable")).click();
driver.switchTo().frame(0);

WebElement draggable = driver.findElement(By.cssSelector("#draggable"));
WebElement droppable = driver.findElement(By.cssSelector("#droppable"));
Actions actions=new Actions(driver);
actions.dragAndDrop(draggable,droppable).perform();
Thread.sleep(5000);

	driver.close();
	}

}
