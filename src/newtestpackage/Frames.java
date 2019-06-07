package newtestpackage;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;

public class Frames extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.get("C:\\Users\\RUKKUSADHU\\Desktop\\htmlsource\\frame_page2.html.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("hello");
	/*WebElement T1obj= driver.findElement(By.id("t1"));
	T1obj.sendKeys("hello");
	driver.switchTo().defaultContent();
	driver.findElement(By.id("t2")).sendKeys("T22222222");*/
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("T22222222");
		
		//T1obj.sendKeys("hello");

	}
	
	

}
