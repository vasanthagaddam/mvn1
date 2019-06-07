package testYenthra;

public class Secondminarray {

	public static void main(String[] args) {
		int[] a={35,27,16,38};
		int temp=0;
		for(int i=0;i<=a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j])
				{ temp=a[i];
				a[i]=a[j];
				a[j]=temp;
					
				}}
		}
				for(int i=0;i<=a.length-1;i++)
				{				
						System.out.println(a[i]);
				}
				System.out.println("the second minimum element in an array is "+a[1]);
				
				System.out.println("the second maximum element in an array is "+a[2]);
				
				}
			
				
		

	

}
