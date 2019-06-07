package newtestpackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class TakeScreenshotAs {

	//private static Object FileUtils;

	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//launch the Fire fox browser
		WebDriver driver = new FirefoxDriver();
	//	driver.get("https://www.google.com");
		driver.get("https://www.shaadi.com");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile= ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./Screenshots/Shaadi.png");
        Files.copy(srcFile,destFile);
        driver.close();
		}

}
