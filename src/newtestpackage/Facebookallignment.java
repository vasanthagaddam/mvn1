package newtestpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookallignment {

	public static void main(String[] args) {
	//	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	//	WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//launch the Fire fox browser
		WebDriver driver = new FirefoxDriver();
	
	    driver.get("https://www.facebook.com/");
	    WebElement emailTB= driver.findElement(By.id("email"));
	    
	    int emailXcor= emailTB.getLocation().getX();
	    System.out.println(emailXcor);
	    
	    int emailYcor= emailTB.getLocation().getY(); 
	    System.out.println(emailYcor);
	    
	    int emailWidth= emailTB.getSize().getWidth(); 
	    System.out.println(emailWidth);
	    
	    int emailHeight=emailTB.getSize().getHeight();
	    System.out.println(emailHeight);
	    
	    
	    WebElement pswTB= driver.findElement(By.id("pass"));
	    int pswXcor= pswTB.getLocation().getX();
	    System.out.println(pswXcor);
	    
	    int pswYcor= pswTB.getLocation().getY(); 
	    System.out.println(pswYcor);
	    
	    int pswWidth= pswTB.getSize().getWidth(); 
	    System.out.println(pswWidth);
	    
	    int pswHeight=pswTB.getSize().getHeight();
	    System.out.println(pswHeight);
	    
	    if(emailXcor!=pswXcor && emailYcor==pswYcor && emailWidth==pswWidth && emailHeight==pswHeight)
	    {
	    	System.out.println("facebook text boxes are alligned");
	    }
	    else
	    {
	    	System.out.println("allignment is failed");
	    }
	}
}

