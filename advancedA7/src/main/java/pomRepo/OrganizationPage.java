package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Organizations")
	private WebElement organizationLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createOrganization;
	
	@FindBy(id = "employees")
	private WebElement employeesTextBox;

	public WebElement getEmployeesTextBox() {
		return employeesTextBox;
	}

	public WebElement getOrganizationLink() {
		return organizationLink;
	}

	public WebElement getCreateOrganization() {
		return createOrganization;
	}

	public WebElement getNameTxtBox() {
		return nameTxtBox;
	}

	public WebElement getIndustryDropdown() {
		return industryDropdown;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getGroupRadioButton() {
		return groupRadioButton;
	}

	@FindBy(name = "accountname")
	private WebElement nameTxtBox;
	
	@FindBy(name = "industry")
	private WebElement industryDropdown;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	@FindBy(name = "assigntype")
	private WebElement groupRadioButton;
	
	@FindBy(id = "phone")
	private WebElement phoneTextBox;
	
	@FindBy(id = "email1")
	private WebElement emailTextBox;
	
	
	public WebElement getPhoneTextBox() {
		return getPhoneTextBox();
	}
	
	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	

	

	public WebElement getOrganizationLink1() {
		return getOrganizationLink();
	}

	


	
	}

