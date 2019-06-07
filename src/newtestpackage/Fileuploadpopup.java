package newtestpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Fileuploadpopup extends BaseClass {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		driver.get("https://www.naukri.com/");
		WebElement uploadcvobj = driver.findElement(By.xpath("//input[@value='Post your CV']"));
		uploadcvobj.sendKeys("D:\\DOTNET\\Dot Net Books\\C_Sharp_Notes.pdf");
		

	}

}
