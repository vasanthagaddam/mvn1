package testYenthra;

import java.util.Scanner;

public class ReverseNum{
	
	public static void main(String[] args) {
		int num=123,rev=0;

		while(num!=0){	
			int rem=num%10;
	rev=rev*10+rem;
	num=num/10;
	}
	
System.out.println("the reverse of a num is num:"+rev);
}
}
