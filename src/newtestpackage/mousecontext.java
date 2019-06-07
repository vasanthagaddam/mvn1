package newtestpackage;

import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;

//import com.sun.xml.internal.ws.api.pipe.ThrowableContainerPropertySet;


public class mousecontext extends BaseClass {

	public static void main(String[] args) throws AWTException, Exception  {
			driver.get("http://rukkusadhu-pc/login.do");
			
	/*WebElement actitimeunTbc=driver.findElement(By.name("username"));
			// create an object of actions class
			Actions action=new Actions(driver);
	/*	action.sendKeys("admin").perform();
			Robot r=new Robot();
			//using control+A+DELETE
	
			
	    	r.keyPress(KeyEvent.VK_CONTROL);	
			r.keyPress(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_DELETE);
			
			r.keyRelease(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_CONTROL);
			
			Thread.sleep(50000);*/
		
			
			//using double click
			
	/*		action.sendKeys("admin").perform();
		
			action.doubleClick(actiTimeunTbc).perform();
			Robot r1=new Robot();
			r.keyPress(KeyEvent.VK_DELETE);
			Thread.sleep(5000);*/
			
			
			
			//delete username text using backspace
	/*		action.sendKeys("admin").perform();
			Robot r2=new Robot();
					
		String str = actiTimeunTbc.getAttribute("value");
			
			System.out.println(str);
			int strsize=str.length();
			System.out.println(strsize);
			for(int i=0;i<strsize;i++)
			{

				r2.keyPress(KeyEvent.VK_BACK_SPACE);
				r2.keyRelease(KeyEvent.VK_BACK_SPACE);
				
				System.out.println("str["+i+"]:"+actiTimeunTbc.getAttribute("value"));
			}
			Thread.sleep(5000);*/
			//delete usename value by using javascript
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByName('username')[0].value='admin'");
		Thread.sleep(3000);
		js.executeScript("document.getElementsByName('username')[0].value=''");
		
		
			
		
		}
}

