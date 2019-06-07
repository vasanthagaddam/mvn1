package testYenthra;

public class FirstHalfAndSecondHalfInReverse {

	public static void main(String[] args) {
		int a[]={4,6,2,8,3,5};

		System.out.println("************reverse of first half of an  array*************");
		for(int i=a.length/2-1;i>=0;i--)

		{	System.out.println(a[i]);
		}
	
		System.out.println("************reverse of second half of an  array*************");
	
	for(int i=a.length-1;i>=a.length/2;i--)

	{	System.out.println(a[i]);
	}
}


}
