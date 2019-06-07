package testNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sequance2 {
  @Test(invocationCount=2)
  public void f() {	
  }
	  @BeforeSuite
	  public void beforeSuite() {
	  System.out.println("before suite");
  }

 @BeforeTest
  public void beforeTest() {
	  System.out.println("beforetest");
  }

@BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }
@BeforeMethod
public void beforeMethod() {
  System.out.println("before method");
}
@Test
public void f1() {
	  System.out.println("hello");
}

@AfterMethod
public void afterMethod() {
  System.out.println("after method");
}
@AfterClass
public void afterClass() {
  System.out.println("after class");
} 
@AfterTest
public void afterTest() {
  System.out.println("after test");
}
@AfterSuite
public void afterSuite() {
  System.out.println("after suite");
}


}
