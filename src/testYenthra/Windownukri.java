package testYenthra;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import newtestpackage.BaseClass;

public class Windownukri extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.naukri.com/");
		//String parentWH
		String parentWH = driver.getWindowHandle();
		System.out.println("parent window handle id is"+parentWH);  
		Set<String> allWH = driver.getWindowHandles();
		System.out.println("number of windows are:"+allWH.size());
		for (String WH:allWH)
		{
			driver.switchTo().window(WH);
			System.out.println(WH+"==>"+driver.getTitle());
			//driver.close();
			Thread.sleep(3000);
		
		}
/*System.out.println("close the windows in alternate way");		
List<String> lst=new ArrayList<>(allWH);
for(int i=lst.size()-1;i>=0;i-=2)
{
		
driver.switchTo().window(lst.get(i));
driver.close();
Thread.sleep(2000);
}*/
		
System.out.println( "close the windows in reverse order");	
List<String> lst=new ArrayList<>(allWH);
for(int i=lst.size()-1;i>=0;i--)
{
		
driver.switchTo().window(lst.get(i));
System.out.println(driver.getTitle());
driver.close();
Thread.sleep(2000);
}

		

	}
}