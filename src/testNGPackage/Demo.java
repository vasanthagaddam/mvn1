package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test(priority=1)
	public void createUser(){
		System.out.println("create user...");
		Reporter.log("createuser");
	
	}
	@Test(priority=2,invocationCount=3,enabled=false)
	public void eidituser(){
		System.out.println("edit user...");
		Reporter.log("edituser");
	}
	@Test(priority=3)
		public void deleteUser(){
			System.out.println("deleteUser...");
			Reporter.log("deleteuser");
		}
	

}
