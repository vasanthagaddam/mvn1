package testYenthra;

import java.util.TreeSet;
import java.util.zip.Inflater;

public class Minelearray {

	public static void main(String[] args) {
		int[] a={6,3,2,12,10};
		int lowest=a[0];
		int index=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<lowest){

				lowest=a[i];
				index=i;
			}
		}
		System.out.println(lowest);
		
	
	
		

	
	}
	
}


