package testNGPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderdemo {
@DataProvider
public Object[][] loginData(){
	Object[][] data= new Object[2][2];
	data[0][0]="admin1";
	data[0][1]="manager1";
	
	data[1][0]="admin2";
	data[1][1]="manager2";
	return data;	
}
@Test(dataProvider="loginData")
public void teatlogin(String un,String pwd){
	System.out.println(un+":"+pwd);
	
}

}
