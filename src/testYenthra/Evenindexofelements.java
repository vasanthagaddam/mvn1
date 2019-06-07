package testYenthra;

public class Evenindexofelements {

	public static void main(String[] args) {
		int[] a={35,27,39,49,20};
		//for (int i=0;i<=a.length-1;i++)
		for(int i=a.length-1;i>=0;i--)	
		
		{
			
			if(i%2==0)
			{ 
				System.out.println(a[i]);
			}
			}

	}

}
