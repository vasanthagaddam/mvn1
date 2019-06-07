package testYenthra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.hslf.util.SystemTimeUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import newtestpackage.BaseClass;

public class ListboxusingAssertion extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		String[] exp={"IDLY","DOSA","POORI","VADA","POORI","POORI"};
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
		
		List explst=new ArrayList(Arrays.asList(exp));
		System.out.println("expected values"+explst);
		ArrayList<String> actuallist=new ArrayList<String>();
		for(WebElement option:alloptions)
		{String text=option.getText();
		System.out.println(text);
		actuallist.add(text);
		
		
		
	//	List actuallist=new ArrayList(Arrays.asList(alloptions));	
		System.out.println( actuallist);
	
	    	    
	    		   Assert.assertEquals(actuallist, explst);
	   
	            	Thread.sleep(2000); 
	            	
	    		   }
	    	
		
	}
	    	

}
	
