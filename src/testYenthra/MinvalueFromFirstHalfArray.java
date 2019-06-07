package testYenthra;

public class MinvalueFromFirstHalfArray {

	public static void main(String[] args) {
		int[] a={6,3,2,12,10,5};
	/*	int lowest=a[0];
		int index=0;
		for(int i=1;i<=a.length/2;i++)
		{
			if(a[i]<lowest){

				lowest=a[i];
				index=i;
			}
		}
		System.out.println("minimum value from first half"+lowest);
	}*/
	int min=a[a.length/2];
	
		for(int i=(a.length/2)+1;i<a.length;i++)
		{
			if(a[i]<min){

				min=a[i];
			
			}
		}
		System.out.println("minimum value from first half"+min);
	}
}
		
		
