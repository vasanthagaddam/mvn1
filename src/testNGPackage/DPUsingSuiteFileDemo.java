package testNGPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class DPUsingSuiteFileDemo {
	@Parameters({"city","age"})
	@Test
	public void takeDataFromSuiteFile(String city,String age){
		System.out.println(city+":"+age);
		System.out.println(age+20);
		System.out.println(Integer.parseInt(age)+age);
		
	}

}
