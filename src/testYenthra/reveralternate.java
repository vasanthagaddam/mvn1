package testYenthra;

public class reveralternate {
	public static void main(String[] args) {
		String str="i love java and selenium";
		String[] spl = str.split(" ");
		System.out.println(spl.length);
		for(int i=spl.length-1;i>=0;i--)
		{ if(i%2==0){
			String word=spl[i];			
			String rev=" ";
			for(int j=word.length()-1;j>=0;j--){
				
				rev=rev+word.charAt(j);
			}System.out.print(rev);
			}
		}
		}
}
