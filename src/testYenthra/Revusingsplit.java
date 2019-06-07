package testYenthra;

public class Revusingsplit {

	public static void main(String[] args) {
		String str="hai hello how r u";
		
		String[] spl = str.split(" ");
		System.out.println(spl.length);
		for(int i=spl.length-1;i>=0;i--)
		{
			String word=spl[i];			
			String rev=" ";
			for(int j=word.length()-1;j>=0;j--){
				
				rev=rev+word.charAt(j);
			}System.out.print(rev);
		
			}
		/*System.out.println();
		for(int i=0;i<spl.length-1;i++)
		{
			if(i%2==0)
			 {
				System.out.print(spl[i]+" " );
			 }
	}*/

}
}
