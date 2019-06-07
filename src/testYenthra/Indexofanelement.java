package testYenthra;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class Indexofanelement {

	public static void main(String[] args) {
	int[] a={63,7,3,47,28};
	int len=a.length;
	int index=0; 
	Scanner sc=new Scanner(System.in);
	System.out.println("***********enter the element to be searched************");
	int temp=sc.nextInt();
	while(index<len)
	{
		if(a[index]==temp)
		System.out.println("index of the element is"+index);
		index++;
}
	}
}
