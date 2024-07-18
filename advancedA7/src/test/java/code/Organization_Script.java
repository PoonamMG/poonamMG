package code;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.ExcelUtil;
import genericlib.JavaUtil;
import genericlib.WebDriverUtil;
import pomRepo.LoginPage;
import pomRepo.OrganizationPage;

public class Organization_Script {
	public static void main(String[] args) throws IOException, InterruptedException {
		 WebDriver driver=new ChromeDriver();
			
			WebDriverUtil wb= new WebDriverUtil();
			ExcelUtil um= new ExcelUtil();
			wb.maximizeTheWindow(driver);
			wb.implicitlyWait(driver);
			driver.get(um.getDataFromPropertyFile("url"));
			LoginPage lp= new LoginPage(driver);
			lp.getUserTextBox().sendKeys(um.getDataFromPropertyFile("username"));
			lp.getPswdTxtBox().sendKeys(um.getDataFromPropertyFile("password"));
			lp.getLoginButton().click();
			Thread.sleep(2000);
			
			OrganizationPage op= new OrganizationPage(driver);
			op.getOrganizationLink().click();
			op.getCreateOrganization().click();
			Thread.sleep(2000);
			JavaUtil ja= new JavaUtil();
			int num = ja.getRandomNumber();
			op.getNameTxtBox().sendKeys(um.getDataFromExcelFile("Organization", 0, 0)+num);
			Thread.sleep(3000);
			wb.selectDropdownByValue(op.getIndustryDropdown(), "Healthcare");
			Thread.sleep(3000);
			op.getSaveButton().click();
			
	}
}
