package testYenthra;

public class pattern {
	public static void main(String[] args) {
		int temp=0;
				int x=0;
		
		for(int i=1;i<=4;i++)
		{
			//temp=temp+i+1;
			for(int k=3;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
			 x++;
				System.out.print(x+" ");
			
			}
			System.out.println();

		}
	}
}
