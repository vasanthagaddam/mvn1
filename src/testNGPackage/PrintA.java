package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrintA {
	@Test
	public void printA()
		{System.out.println("print A");
		Reporter.log("print only in testng  report");
		Reporter.log("print on both console and testng", true);
		
		}
	}


