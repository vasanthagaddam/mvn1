package newtestpackage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;


public class ActitimeloginErrMsg extends BaseClass{

	public static void main(String[] args) {
		driver.get("http://rukkusadhu-pc/login.do");
		driver.findElement( By.id("loginButton")).click();
		String st="//span[contains(text(),'invalid')]";
		WebElement errmsgobj=driver.findElement(By.xpath(st));
		//verifiy the error message is displayed or not
		boolean displayed= errmsgobj.isDisplayed();
		if(displayed)
		{
			System.out.println("error message is displayed");
		    String actErrMsgText = errmsgobj.getText();
		    System.out.println(actErrMsgText);
	     	if(actErrMsgText.equals("Username or Password is invalid. Please try again.")) 
	      	{
			System.out.println("correct error message is displayed");
			//he verify the color of the message
		      String actinitialcolor = errmsgobj.getCssValue("color");
		      System.out.println("actual initial color is "+actinitialcolor);
			  String ColorasHex= Color.fromString(actinitialcolor).asHex();
			  System.out.println(ColorasHex); 
		     // if(actinitialcolor.equals("#ce0100"))
		    if(ColorasHex.equals("#ce0100"))			  
		    	{ System.out.println("valid color is : RED"); 
		      }
		      else 
		      {
		    	  System.out.println("invalid color");
		      }
	      	}
	 	else 
	 	{
	 		System.out.println("incorrect message is displayed"); 
	 	}
	   	}
	  else
	  {
		  System.out.println("error message is not displayed");
	  }
	}
	
		    	  
		      
}