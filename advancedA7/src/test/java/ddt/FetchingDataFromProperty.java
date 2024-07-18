package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FetchingDataFromProperty {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	    
		FileInputStream fis=new FileInputStream("./src/test/resources/excel.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		System.out.println(wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue());
		System.out.println(wb.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue());
		System.out.println(wb.getSheet("Sheet1").getRow(3).getCell(3).getBooleanCellValue());
		
		
		

	}

}
