package testYenthra;

import java.util.Scanner;

public class Electricitybill {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double electricitybill=0;
	double discount=0;
	double units;
	double arrears;
	System.out.println("enter the arrears i.e due value");
	arrears=sc.nextDouble();
	System.out.println("enter the lastmonth electricity bill in units");
	 units =sc.nextDouble();
	 
	if(units<=50)
	{
		electricitybill=units*1.20;		
		System.out.println(electricitybill);
	}
	
	else if(units>=50 && units<=100)		
	{
		electricitybill =50*1.20+(units-50)*2.4;
		System.out.println(electricitybill);
	}
	else if(units>100 && units<=150)
	{
		electricitybill=50*1.20+50*2.4+(units-3.6);
	System.out.println(electricitybill);
	}
	else if(units>150)
		{
		electricitybill=50*1.20+50*2.4+50*3.6+(units-150)*4.8;
		System.out.println(electricitybill); 
		
	 if(units>200)
	{
	discount=electricitybill*5/100;
	System.out.println(discount);
	}}
if(arrears!=0)
	
{
	arrears=arrears*10/100;
	System.out.println(arrears);
}

	electricitybill =arrears+electricitybill-discount;
	System.out.println(electricitybill);


	}	
}

