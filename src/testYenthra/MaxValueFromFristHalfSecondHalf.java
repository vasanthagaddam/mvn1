package testYenthra;

public class MaxValueFromFristHalfSecondHalf {

	public static void main(String[] args) {
		int[] a={34,20,15,28,35,29};
	/*	int max=a[0];
		for(int i=1;i<a.length/2;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("maximum value from the frist half of an array is "+max);
		}
*/
		int max=a[a.length/2];
		for(int i=(a.length/2)+1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("maximum value from the frist half of an array is "+max);
		}


}
