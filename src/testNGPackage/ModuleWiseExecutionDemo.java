package testNGPackage;

import org.testng.annotations.Test;

public class ModuleWiseExecutionDemo {
	@Test(groups={"user","smoke"})
	public void createUser(){
		System.out.println("create user...");	
	}
	@Test(groups={"user","regression"})
	public void eidituser(){
		System.out.println("edit user...");
	}
	@Test(groups={"user","regression"})
		public void deleteUser(){
			System.out.println("deleteUser...");
	}
	@Test(groups={"product","smoke"})
			public void createproduct(){
				System.out.println("createproduct...");	
			}
	@Test(groups={"product","regression"})
			public void editproduct(){
				System.out.println("edit product...");
			}
			@Test(groups={"product","regression"})
				public void deleteproduct(){
					System.out.println("deleteproduct...");
	
			
			}	
}
