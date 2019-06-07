package testYenthra;

public class Avgarr {

	public static void main(String[] args) {
		int[] a={15,20,30,10,5};
		int len=a.length;
		int sum=0,avg;
	for(int i=0;i<=a.length-1;i++){
		sum=sum+a[i];
	}
	System.out.println(sum);
	avg=sum/a.length;
	System.out.println(avg); 
	
	
	}

}
