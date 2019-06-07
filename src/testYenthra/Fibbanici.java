package testYenthra;

public class Fibbanici {

	public static void main(String[] args) {
		int fib1=0;
		int fib2=1;
		int fib3=0;
		System.out.println(fib1+" "+fib2+" ");
		while(fib3<5)
		{
		fib3=fib1+fib2;
		fib1=fib2;
		fib2=fib3;
			System.out.println("fibbanoci series are "+fib3);
		} 
		}
	

}
