package newtestpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class AlignmentCheckofActitime {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//launch the Fire fox browser
	//	WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://rukkusadhu-pc/login.do");
		WebElement unTB= driver.findElement(By.name("username")); 
		int unxcor=unTB.getLocation().getX();
		int unycor=unTB.getLocation().getY();
		int unHei=unTB.getSize().getHeight();
		int unWid=unTB.getSize().getWidth();
		System.out.println(unxcor); 
		
		WebElement pwdTB= driver.findElement(By.name("pwd")); 
		int pwdxcor=pwdTB.getLocation().getX();
		System.out.println(pwdxcor);
		
		int pwdycor=pwdTB.getLocation().getY();
		int pwdHei=pwdTB.getSize().getHeight();
	    int pwdWid=pwdTB.getSize().getWidth();
		
		if( unxcor==pwdxcor && unycor!=pwdycor && unHei==pwdHei && unWid==pwdWid )
		{
			System.out.println(" actitime username and password are aligned");
		}
		else
		{
		System.out.println(" actitime username and password are not aligned");
		}

		
		driver.close();
	}

}
