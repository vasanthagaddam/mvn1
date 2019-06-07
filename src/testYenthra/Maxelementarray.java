package testYenthra;

public class Maxelementarray {

	public static void main(String[] args) {
	int[] a={34,20,15,28};
	int max=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}
	}
	System.out.println(max);
	}

}
