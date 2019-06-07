package testYenthra;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int temp=1;
				for(int i=0;i<n;i++) {
					
					for(int k=3;k>=i;k--)
					{			
					System.out.print(" ");
					}
								for(int j=0;j<=i;j++)
					{
						System.out.print(temp);	
						temp++;
					}
								System.out.println();

				}
	}

}
