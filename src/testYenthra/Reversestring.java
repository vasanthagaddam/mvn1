package testYenthra;

public class Reversestring {

	public static void main(String[] args) {
	String str="i love sellinium and java";
	String[] s=str.split(" ");
	for(int i=0;i<=s.length-1;i++)
	{
		System.out.println(i+":"+s[i]);
		
	}
	System.out.println(" print the elements in reverse order");
	System.out.println(" ");
	for(int i=s.length-1;i>=0;i--)
	{
		System.out.print(s[i]+" ");
		
	}
	

	}

}
