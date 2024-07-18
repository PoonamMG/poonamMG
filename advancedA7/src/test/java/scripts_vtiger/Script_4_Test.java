package scripts_vtiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlib.Baseclass;
import pomRepo.CampaignsPage;
import pomRepo.OrganizationPage;

public class Script_4_Test extends Baseclass {
	@Test
	public void script4() throws EncryptedDocumentException, IOException {
		CampaignsPage cp= new CampaignsPage(driver);
		cp.getMoreOption().click();
		cp.getCampaignsLink().click();
		cp.getCreateCampaings().click();
		cp.getCampaingsName().sendKeys(um.getDataFromExcelFile("Campaings", 0, 1));
		OrganizationPage op= new OrganizationPage(driver);
		op.getSaveButton().click();
	}
}

