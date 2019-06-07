package newtestpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementmethod2 extends BaseClass  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.get("http://rukkusadhu-pc/login.do");
		WebElement unTB= driver.findElement(By.name("username"));
		boolean displayed = unTB.isDisplayed();
		System.out.println(displayed);		
		boolean enableobj = unTB.isEnabled();
			System.out.println(enableobj);
			if (enableobj	)
			{	
			unTB.sendKeys("admin");
			//boolean selected = unTB.isSelected();
			//{
				//if(selected)
	//		{
		//			System.out.println(selected);
			String usernametext = unTB.getText();
			System.out.println(usernametext);
			}
			}
}
