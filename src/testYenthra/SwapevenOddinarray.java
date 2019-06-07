package testYenthra;

public class SwapevenOddinarray {
	public static void main(String[] args) {
	int[] a={28,36,7,5,82,3};
	int temp=0;
	for(int i=0;i<a.length;i+=2)
	{
		for(int j=1;j<a.length;j+=2)
	
	{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;}
	
		

	}
	
	for(int i=0;i<a.length;i++)
	{System.out.println(a[i]);	}
	}
}
