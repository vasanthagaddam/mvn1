package testYenthra;

import java.util.Scanner;

public class AvgArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum =0;
		int avg;
		System.out.println("enter no of elements n:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the values into an array");
	
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("print all the values   a["+i+"] "+" = " +a[i]);
		}
		for(int i=0;i<a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		System.out.println("average of an array is " + sum/n);
	}
	

}
