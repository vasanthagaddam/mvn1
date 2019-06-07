package newtestpackage;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Windowpopup_usingAutoIT extends BaseClass {
	public static void main(String[] args) throws InterruptedException, Exception  {
		driver.get("http://rukkusadhu-pc/login.do");

		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		Runtime.getRuntime().exec("./autoit/printpopup.exe");
		Thread.sleep(3000);
		driver.close();
			}

}
