package testYenthra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldata {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\RUKKUSADHU\\Desktop\\htmlsource\\sheet1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("Sheet1");
		Row row=sheet.getRow(0);
		for(int i=0;i<row.getLastCellNum();i++)
		{for(int j=0;j<sheet.getRow(i).getLastCellNum();i++) {
			Cell cell=row.getCell(j);	
		    System.out.println(row.getCell(i));
		   
		
		}
		}
	}

}
