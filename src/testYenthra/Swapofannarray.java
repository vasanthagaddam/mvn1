package testYenthra;

public class Swapofannarray {

	public static void main(String[] args) {
	int[] a={28,36,7,5,82,3};
	int temp=0;
	for(int i=1;i<a.length;i++)
	{
		temp=a[i-1];
		a[i-1]=a[i];
		a[i]=temp;
	}
	for(int i=0;i<=a.length-1;i++){
	System.out.println(a[i]);
	}
	}
	

}
