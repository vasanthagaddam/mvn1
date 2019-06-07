package testYenthra;

public class MaxOfOddIndexArray {

	public static void main(String[] args) {
			int[] a={65,20,30,40,11,20};
			int len=a.length ;
		//	System.out.println(len);
			int max=a[1];
			
			for(int i=1;i<=a.length;i+=2)
				
			{
				if(max<a[i+1])
				{
					max=a[i+1];
				}
				
			}
			System.out.println(max); 
		/*	}System.out.println(a[i]);		
			//}
		//	System.out.println(a[4]);
		//System.out.println(a.length); 
			
		//	for(int i=1;i<=a.length;i++)
			{
			if(max<a[i])
			{
				max=a[i];
			}*/
			
		
			
	}
	
	

}
