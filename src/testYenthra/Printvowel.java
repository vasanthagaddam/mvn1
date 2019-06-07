package testYenthra;

public class Printvowel {
	public static void main(String[] args) {
	String str="hellojava";
	int count=0;
	for(int i=0; i<=str.length()-1;i++)
	{char ch=str.charAt(i);
		if((ch=='a')||(ch=='e')||(ch=='o')||(ch=='u')||(ch=='a'))
		{
			count++;
			System.out.print(ch);
			}
	}
	}
}