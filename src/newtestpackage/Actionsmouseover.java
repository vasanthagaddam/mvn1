package newtestpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actionsmouseover extends BaseClass{

		public static void main(String[] args) {
			driver.get("http://www.istqb.in/");
			
		/*	WebElement foundationobj=driver.findElement( By.xpath("(//a[text()='FOUNDATION'])[1]"));
			// create an object of actions class
			Actions action=new Actions(driver);
			action.moveToElement(foundationobj).perform();*/
		/*	WebElement homeobj=driver.findElement( By.xpath("(//a[text()='Home'])[1]"));
			Actions action=new Actions(driver);
			action.moveToElement(homeobj).perform();*/
			WebElement aboutusobj=driver.findElement( By.xpath("(//a[text()='ABOUT US'])[1]"));
			Actions action=new Actions(driver);
			action.moveToElement(aboutusobj).perform();
			
			
			
			
	}

}
