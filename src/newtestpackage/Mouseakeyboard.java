package newtestpackage;

//import java.awt.AWTException; 
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseakeyboard extends BaseClass{

	public static void main(String[] args) throws InterruptedException, Exception  {
		driver.get("http://rukkusadhu-pc/login.do");
		
	WebElement actitimeinc=driver.findElement( By.xpath("//a[text()='Actimind Inc.']"));
		// create an object of actions class
		Actions action=new Actions(driver);
	//	action.moveToElement(actitimeinc).perform();*/
		action.contextClick(actitimeinc).perform();
		Thread.sleep(3000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_P);
		rb.keyRelease(KeyEvent.VK_P);
		Thread.sleep(3000);
		driver.close();
		 
		
		
}

}