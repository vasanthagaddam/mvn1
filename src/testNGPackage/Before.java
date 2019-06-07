package testNGPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before {
	
	
	@BeforeMethod
	public void login(){
		System.out.println("hi am first");
		
	}
	@Test
	public void logto(){
		System.out.println("himidddle");}
	@AfterMethod
	public void logout(){
		System.out.println("hi am last");
		
	}

}
