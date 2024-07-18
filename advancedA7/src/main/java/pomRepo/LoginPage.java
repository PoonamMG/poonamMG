package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

@FindBy(name = "user_name")
private WebElement userTextBox;

@FindBy(name = "user_password")
private WebElement pswdTxtBox;

public WebElement getUserTextBox() {
	return userTextBox;
}

public WebElement getPswdTxtBox() {
	return pswdTxtBox;
}

public WebElement getLoginButton() {
	return loginButton;
}

public WebElement getText() {
	return text;
}

@FindBy(id = "submitButton")
private WebElement loginButton;

@FindBy(xpath = "//div[text()='Powered by vtiger CRM - 5.4.0']")
private WebElement text;

public WebElement getAdminButton() {
	return adminButton;
}

public WebElement getLogoutButton() {
	return logoutButton;
}

@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
private WebElement adminButton;

@FindBy(linkText = "Sign Out")
private WebElement logoutButton;

}

