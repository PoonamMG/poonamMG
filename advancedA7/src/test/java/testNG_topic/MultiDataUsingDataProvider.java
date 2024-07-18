package testNG_topic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericlib.ExcelUtil;
import pomRepo.LoginPage;
import pomRepo.OrganizationPage;

public class MultiDataUsingDataProvider {
@DataProvider
public String[][] testData() throws EncryptedDocumentException, IOException{
	FileInputStream fis=new FileInputStream("./src/test/resources/Organization.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	  Sheet sheet = wb.getSheet("Sheet1");
	 int rowNum = sheet.getPhysicalNumberOfRows();
	 int colNum = sheet.getRow(0).getPhysicalNumberOfCells();
	 String[][] data= new String[rowNum][colNum];
	 for(int i=0;i<rowNum;i++) {
		 for(int j=0;j<colNum;j++) {
			 data[i][j]= sheet.getRow(i).getCell(j).toString();
		 }
	 }
	 return data;
}

@Test(dataProvider = "testData")
public void details(String[] testData) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	ExcelUtil um= new ExcelUtil();
	driver.get(um.getDataFromPropertyFile("url"));
	LoginPage lp= new LoginPage(driver);
	lp.getUserTextBox().sendKeys(um.getDataFromPropertyFile("username"));
	lp.getPswdTxtBox().sendKeys(um.getDataFromPropertyFile("password"));
	lp.getLoginButton().click();
	OrganizationPage op= new OrganizationPage(driver);
	op.getOrganizationLink().click();
	op.getCreateOrganization().click();
	op.getNameTxtBox().sendKeys(testData[0]);
	Thread.sleep(2000);
	op.getPhoneTextBox().sendKeys(testData[1]);
	Thread.sleep(2000);
	op.getEmailTextBox().sendKeys(testData[2]);
	
	
	
	
}

}
