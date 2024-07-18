package scripts_vtiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericlib.Baseclass;
import pomRepo.ContactPage;
import pomRepo.OrganizationPage;

public class Script_3_Test extends Baseclass {
	ExtentTest test;
	@Test
	public void script3() throws EncryptedDocumentException, IOException {
		ContactPage cp=new ContactPage(driver);
		test.log(Status.INFO, "User has clicked on Contact link");
		cp.getContactLink().click();
		cp.getCreateContactButton().click();
		test.log(Status.INFO, "User has clicked on Create contact button");
		cp.getLastNameTextBox().sendKeys(um.getDataFromExcelFile("Contact", 0, 0));
		test.log(Status.INFO, "User has entered data in last name");
		OrganizationPage op= new OrganizationPage(driver);
		op.getSaveButton().click();
		test.log(Status.INFO, "User has clicked  on Save button");
	}
}

