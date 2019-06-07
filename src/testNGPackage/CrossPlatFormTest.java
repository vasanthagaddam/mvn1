package testNGPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossPlatFormTest {
@Parameters("browser")
@Test
public void runInMultipleOsAndBrowsers() throws MalformedURLException, InterruptedException
{
	URL whichSystem=new URL("http://localhost:4444/wd/hub");
	DesiredCapabilities whichBrowser=new DesiredCapabilities();
	whichBrowser.setBrowserName("browser");
    WebDriver driver=new RemoteWebDriver(whichSystem,whichBrowser);	
	driver.get("http://rukkusadhu-pc/login.do");
	WebElement unTB= driver.findElement(By.name("username"));	
	for(int i=1;i<=2;i++)
	{	unTB.sendKeys("admin -->"+i);
	Thread.sleep(2000);
	unTB.clear();
}
driver.close();
}
}
