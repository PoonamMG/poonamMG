package scripts_vtiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlib.Baseclass;
import pomRepo.OrganizationPage;
import pomRepo.ProductPage;

public class Script_6_Test extends Baseclass{
	@Test
	public void script1() throws EncryptedDocumentException, IOException, InterruptedException {
		ProductPage pp= new ProductPage(driver);
		pp.getProductLink().click();
		pp.getCreateProduct().click();
	    pp.getProductName().sendKeys(um.getDataFromExcelFile("Product",0 ,0));
	    pp.getProductSheet().sendKeys(um.getDataFromExcelFile("Product", 0, 1));
		OrganizationPage op= new OrganizationPage(driver);
		op.getSaveButton().click();
	}
}

