package scripts_vtiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlib.Baseclass;
import pomRepo.OrganizationPage;

public class Script_2_Test extends Baseclass{
	@Test
	public void script1() throws EncryptedDocumentException, IOException, InterruptedException {
		OrganizationPage op= new OrganizationPage(driver);
		op.getOrganizationLink().click();
		op.getCreateOrganization().click();
		int ranNum = ja.getRandomNumber();
		op.getNameTxtBox().sendKeys(um.getDataFromExcelFile("Organization", 0, 0)+ranNum);
		//op.getEmployeesTextBox().sendKeys(um.getDataFromExcelFile("Organization", 1, 0));
		Thread.sleep(2000);
		op.getSaveButton().click();
		Thread.sleep(2000);

}
}
