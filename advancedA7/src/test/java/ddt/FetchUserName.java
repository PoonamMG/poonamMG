package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchUserName {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		/*ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();*/
		FileInputStream fis=new FileInputStream("./src/test/resources/excel.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet("Sheet2").createRow(0).createCell(0).setCellValue("Automation");
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/excel.xlsx");
		wb.write(fos);
		wb.close();
		
		
		
		

	}

}
