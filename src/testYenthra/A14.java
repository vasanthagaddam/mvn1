package testYenthra;

public class A14 {

	public static void main(String[] args) {
		System.out.println(" sum of second half of an array");
		int[] a={15,20,5,20};
		int len=a.length ;
		int sum=0;
		for(int i=a.length/2;i<a.length;i++)
		{
			
			sum=sum+a[i];		
		}
  System.out.println(sum);


}

}
