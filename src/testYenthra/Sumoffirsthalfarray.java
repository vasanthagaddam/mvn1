package testYenthra;

public class Sumoffirsthalfarray {

	public static void main(String[] args) {
			int[] a={15,20,5,20};
			int len=a.length ;
			int sum=0;
			for(int i=0;i<a.length/2;i++)
			{
				
				sum=sum+a[i];		
			}
	  System.out.println(sum);


	}

}
