package testYenthra;

public class AvgOfFirststAndSecondHalfArray {

	public static void main(String[] args) {
		int[] a={15,20,30,10,5,20};
		/*int len=a.length;
		int sum=0,avg;
	for(int i=0;i<a.length/2;i++){
		sum=sum+a[i];
	}
	System.out.println(sum);
	avg=sum/(a.length/2);
	System.out.println(avg); 
	
	}*/
		int len=a.length;
		int sum=0,avg;
	for(int i=a.length/2;i<a.length;i++){
		sum=sum+a[i];
	}
	System.out.println(sum);
	avg=sum/(a.length/2);
	System.out.println(avg); 
	}

}
