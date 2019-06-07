package testYenthra;

import java.util.Scanner;

public class Sortarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n = 5;
	int a[]=new int[n];
	System.out.println("enter the values into an array");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		System.out.println("print all the values"+a[i]);
	}
	for (int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("print the array elements in sorted order");
	{for(int i=0;i<n-1;i++)
	{
		System.out.print(a[i]+",");
	}
	System.out.println(a[n-1]);
	}
	}
}