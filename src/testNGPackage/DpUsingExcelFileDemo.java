package testNGPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DpUsingExcelFileDemo {

	public static void main(String[] args) throws Throwable{
		
		FileInputStream excelfileobj=new FileInputStream("./testdata/Logindata.xlsx");
        Workbook wb = WorkbookFactory.create(excelfileobj);
        Sheet sh = wb.getSheet("sheet1");
        Row row=sh.getRow(0);
        Cell cell=row.getCell(0);
        String username=cell.toString();
        String password=wb.getSheet("sheet1").getRow(1).getCell(1).toString();
        System.out.println(username+":"+password);
	}
}