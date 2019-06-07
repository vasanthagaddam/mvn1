package newtestpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByusingJavascriptFacebookallignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//launch the Fire fox browser
		WebDriver driver = new FirefoxDriver();
		//WebElement floginbutton=driver.findElement(By.id("loginButton"));
	
	    driver.get("https://www.facebook.com/");
	   // WebElement floginbutton=driver.findElement(By.id("loginbutton"));
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("document.getElementsByName('email')[0].value='vasantha'");
	    jse.executeScript("document.getElementById('pass').value='ssssss'");
	    WebElement floginbutton=driver.findElement(By.id("loginbutton"));
	    jse.executeScript("arguments[0].click()",floginbutton);
	    Thread.sleep(2000);
	   //driver.close();
	   

	}

}
