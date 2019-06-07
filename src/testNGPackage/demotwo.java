package testNGPackage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demotwo {
	@Test(priority=1,dependsOnMethods={"deleteuser"})
	public void createUser(){
		System.out.println("create user...");
		Reporter.log("createuser");
		Assert.fail();
	
	}
	
	@Test(priority=3,dependsOnMethods="createUser")//,"secondmethod"})
		public void deleteUser(){
			System.out.println("deleteUser...");
			Reporter.log("deleteuser");


}
}
