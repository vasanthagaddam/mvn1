package newtestpackage;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;

public class Scrollmethods extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.get("https://www.youtube.com/channel/UClgRkhTL3_hImCAmdLfDE4g");
     /*   WebElement imgobj = driver.findElement(By.id("img"));
       // imgobj.click();
        int imgxcor = imgobj.getLocation().getX();
        int imgycor = imgobj.getLocation().getY();
        System.out.println(imgxcor);
        System.out.println(imgycor);*/
		JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("document.getElementById('img').click()");
       
       
       
	}

}
