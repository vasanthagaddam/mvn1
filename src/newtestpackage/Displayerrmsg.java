package newtestpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Displayerrmsg extends BaseClass {

	public static void main(String[] args) {
		driver.get("http://rukkusadhu-pc/login.do");

 driver.findElement(By.id("loginButton")).click();
//logobj.click();
//System.out.println("displays the error message");
String errmsg="//span[contains(text(),'invalid')]";
WebElement errobj= driver.findElement(By.xpath(errmsg));
//System.out.println(errobj);
boolean displayed = errobj.isDisplayed();
if(displayed)
{
	System.out.println("error message is displyed..");
	String actErrMessText=errobj.getText();
	if(actErrMessText.equals("Username or Password is invalid. Please try again."))
	{	
		System.out.println("matched");
		//System.out.println(actErrMessText);
	}
	
	else
		System.out.println("not matched");

}
else
	
	{
	System.out.println("error message is not displayed");
	}
}
}



