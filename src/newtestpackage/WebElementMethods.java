package newtestpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementMethods extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.get("http://rukkusadhu-pc/login.do");
		WebElement unTB= driver.findElement(By.name("username")); 
     int unxcor = unTB.getRect().getPoint().getX();
   //  int unycor = unTB.getRect().getPoint().getY();
          
     WebElement pwdTB= driver.findElement(By.name("pwd"));
     int pwdxcor = pwdTB.getRect().getPoint().getX();
     
     System.out.println(unxcor+"=="+pwdxcor);
     driver.close();

}
}
