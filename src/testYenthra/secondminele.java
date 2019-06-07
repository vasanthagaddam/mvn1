package testYenthra;

public class secondminele {

	public static void main(String[] args) {
	int[] a={35,20,39,26};
	int min=a[0];
	int count=0;
	for(int i=1;i<=a.length-1;i++)
	{
		if(min>a[i])
          {
			min=a[i];
			count++;
		
	}
	}
		System.out.println(min);
		System.out.println(count);
	

	}
}
