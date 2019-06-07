package testYenthra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelkeywords {

	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\RUKKUSADHU\\Desktop\\keywords.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
    Sheet sh=wb.getSheet("Sheet1");	
    
    for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
    	
    	
    Row row=sh.getRow(i);
    for(int j=0;j<row.getLastCellNum();j++) {
    Cell cell=row.getCell(j);
    System.out.println(cell);
    }
    
    }
	}

}
