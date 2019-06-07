package testYenthra;

public class Sortwordsonlen {
	public static void main(String[] args) {
		String str="hai hello how r u";
		String[] spl = str.split(" ");
		System.out.println(spl.length);
		for(int i=spl.length-1;i>=0;i--)
		{
			String word=spl[i];	
		
			for(int j=0;j<=word.length()-1;j++){
	System.out.print(word.charAt(i));
	}
		}
	}
}
