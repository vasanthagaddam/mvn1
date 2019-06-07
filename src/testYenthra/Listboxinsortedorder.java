package testYenthra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import newtestpackage.BaseClass;

public class Listboxinsortedorder extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
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
		ArrayList<String> list=new ArrayList<String>();
		for(WebElement option:alloptions)
		{String text=option.getText();
		System.out.println(text);
		list.add(text);
		}
		Collections.sort(list);
		System.out.println("print in sorted order");
		for(String value:list){
			System.out.println(value);
		
		}
	}
		}
			