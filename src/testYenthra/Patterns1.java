package testYenthra;

public class Patterns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=4;
int temp=0;
		for(int i=0;i<n;i++) {
			temp=temp+i+1;
			for(int k=3;k>=i;k--)
			{			
			System.out.print(" ");
			}
						for(int j=0;j<=i;j++)
			{
				System.out.print(temp-j);	           
			}
						System.out.println();

		}
	}
}