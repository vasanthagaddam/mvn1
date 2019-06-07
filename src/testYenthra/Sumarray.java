package testYenthra;

public class Sumarray {

	public static void main(String[] args) {
		int[] a={15,20,5,20};
		int len=a.length ;
		int sum=0;
		for(int i=1;i<=a.length-1;i+=2)
		{
			
			sum=sum+a[i];		
		}
  System.out.println(sum);
	}

}
