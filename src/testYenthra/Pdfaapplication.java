package testYenthra;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;

public class Pdfaapplication {

	public static void main(String[] args) throws InvalidPasswordException, IOException {
		File f=new File("C://Users//RUKKUSADHU//Desktop//pdfappl.pdf");
PDDocument docc= PDDocument.load(f);
PDFTextStripper pdfstripper=new PDFTextStripper();  
String str=pdfstripper.getText(docc);
String[] split = str.split("=");
System.out.println(split.length);
System.out.println(split[0]);
String link=split[1];
URL ul=new URL(link);
HttpURLConnection connection=(HttpURLConnection)ul.openConnection();
int responseCode = connection.getResponseCode();
if(responseCode==200) {
	System.out.println(responseCode);
	System.out.println(connection.getResponseMessage());
	System.out.println("link is not broken");	
}


	}

}
