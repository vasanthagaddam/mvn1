package newtestpackage;

import java.util.Set;

public class MultipleBrowserWindowHandle extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.naukri.com/");
		//String parentWH
		String parentWH = driver.getWindowHandle();
		System.out.println("parent window handle id is"+parentWH);  
		Set<String> allWH = driver.getWindowHandles();
		System.out.println("parent window handle id is"+allWH);  
		System.out.println("Total number of browers are"+allWH.size());
		System.out.println("**************window handle IDs are below");
		System.out.println("***************print the title of each browser***********");
		System.out.println("**********close all the browsers************");
	/*	for (String WH:allWH)
		{
			driver.switchTo().window(WH);
			System.out.println(WH+"==>"+driver.getTitle());
			driver.close();
			Thread.sleep(3000);
		}*/
	/*closes only parent window*/
/*		for (String WH:allWH){
			driver.switchTo().window(WH);
			if(WH.equals(parentWH))
			{
				driver.close();
			}
		}
	*/	
	/*	for (String WH:allWH){
			driver.switchTo().window(WH);
			if(!WH.equals(parentWH))
			{
				driver.close();
			}
		}
*/
		for (String WH:allWH){
			driver.switchTo().window(WH);
			String actualTitle=driver.getTitle();
			System.out.println(actualTitle);
			if(actualTitle.equals("Amazon")||actualTitle.equals("WTW"))
			{
				driver.close();
				Thread.sleep(3000);
			}
	
		}
}
}