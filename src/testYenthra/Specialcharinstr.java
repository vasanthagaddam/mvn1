package testYenthra;

public class Specialcharinstr {

	public static void main(String[] args) {
	String s1="@12he#6fg";
	String alpha=" ";
	String digit=" ";
	String spl=" ";
	for(int i=0;i<=s1.length()-1;i++) {
			char ch=s1.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				alpha=alpha+ch;
				System.out.print(alpha);
			
			} 			

			else if(Character.isDigit(ch)){
				digit=digit+ch;
				System.out.println(digit);				
			}
			else
				spl=spl+ch;
			System.out.print(spl);
	}
	}

}
