package newtestpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstseleniumScript {

	public static void main(String[] args) {
		//set the path of geckodriver.exe
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//launch the Fire fox browser
		WebDriver driver = new FirefoxDriver();
				driver.get("https://www.google.com/");
				//google page is loaded
				//with the title
				String title = driver.getTitle();
				//print title and current Url in the console
				System.out.println(title);
				System.out.println(driver.getCurrentUrl());
				
				
				
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver1 = new ChromeDriver ();
				driver1.get("https://www.facebook.com/");
				//google page is loaded
				//with the title
				String title1 = driver1.getTitle();
				//print title and current Url in the console
				System.out.println(title1);
				System.out.println(driver.getCurrentUrl());
				
				driver.close();
		
		
	}
}