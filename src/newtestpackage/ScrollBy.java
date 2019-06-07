package newtestpackage;

import org.openqa.selenium.JavascriptExecutor;

public class ScrollBy extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		driver.get("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_a753E98CA8B6FF054254A070F0");
		 JavascriptExecutor jse=(JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,1000)");
		 Thread.sleep(2000);
		 jse.executeScript("window.scrollBy(0,2000)");
		 Thread.sleep(2000);

		 jse.executeScript("window.scrollBy(0,-1000)");
	//	 Thread.sleep(2000);
		// jse.executeScript("window.scrollBy(0,-1000)")	;
	//	 Thread.sleep(2000);
		// jse.executeScript("window.scrollBy(0,5000)");
		 
			
	}
}

