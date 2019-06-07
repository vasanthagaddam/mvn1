package newtestpackage;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class IndependentDependentxpathDemo extends BaseClass {

	public static void main(String[] args) {
	//	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//launch the Fire fox browser
	//	WebDriver driver = new FirefoxDriver();

		driver.get("https://www.seleniumhq.org/download/");
		String xp="//td[text()='Java']//following-sibling:: td/a[text()='Download']";
		WebElement objaddr=driver.findElement(By.xpath(xp));
		objaddr.click();
	}
		
}	
	

