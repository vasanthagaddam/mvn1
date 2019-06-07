package newtestpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class listboxDemo extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.get("C:\\Users\\RUKKUSADHU\\Desktop\\htmlsource\\listbox.html");
		System.out.println("****total number of options in the listbox****");
		Select s=new Select(driver.findElement(By.id("mtr")));
		List<WebElement> alloptions = s.getOptions();
		System.out.println(alloptions.size());
		System.out.println("***options are mentioned below***");
		for(WebElement option:alloptions)
		{
			System.out.println(option.getText());
		}
       s.selectByIndex(0);
       s.selectByValue("d");
       s.selectByVisibleText("POORI");
       System.out.println("***total selected options***");  
       List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
       System.out.println(allSelectedOptions.size());
       System.out.println("***selected options are***");
       for(WebElement selectedoption:allSelectedOptions)
       {
    	   System.out.println(selectedoption.getText());
    	   
       }
       System.out.println("****First selected option *****");
       WebElement firstSelectedOption = s.getFirstSelectedOption();
       System.out.println(firstSelectedOption.getText());
       s.deselectByIndex(0);
       System.out.println(s.getFirstSelectedOption().getText());
       s.deselectAll();
      System.out.println(s.isMultiple()+"--->multiselect list box"); 
       driver.close();
       
       
       
       
       
       
       
       
	}

}
