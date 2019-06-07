package testYenthra;

public class Maximumofoddindexarray {
public static void main(String[] args) {
	int[] a={15,20,5,9,3,45};
int len=a.length;
	 
	int min=a[0];

			
	for(int i=1;i<a.length;i++)
	{ 
		if((i%2!=0) && min<a[i])
		{
			min=a[i];
			
		}
	}
	System.out.println(min);
}
}
	
	

