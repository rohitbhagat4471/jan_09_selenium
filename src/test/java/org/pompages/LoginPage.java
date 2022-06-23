package org.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class LoginPage {
 private WebDriver driver;
	//Store all webelement
	@FindBy(xpath="//input[@id='username']")
	private WebElement uNameTxtField ;
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwdTxtField;
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	@FindBy(id="keepLoggedInLabel")
	private WebElement keepMeLogginBtn;
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	//Page Action Methods
	public boolean isUserNameFieldDisplayed() {
		return uNameTxtField.isDisplayed();
	}
	public boolean isPasswordFieldDisplayed() {
		return pwdTxtField.isDisplayed();
	}
	public boolean isloginButtonDisplayed() {
		return loginBtn.isDisplayed();
	}
	public boolean isKeepMeloginButtonDisplayed() {
		return keepMeLogginBtn.isDisplayed();
	}
	
	public void verifyLoginPage() {
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(isUserNameFieldDisplayed(), "username field not displayed");
		sa.assertTrue(isPasswordFieldDisplayed(), "password field not displayed");
		sa.assertTrue(isloginButtonDisplayed(), "login button not displayed");
		sa.assertTrue(isKeepMeloginButtonDisplayed(), "keep me login button not displayed");
		sa.assertAll();
	}
public void enterUserName(String uName) {
	uNameTxtField.sendKeys(uName);
}
public void enterPassword(String password) {
	pwdTxtField.sendKeys(password);
}
public void clickLoginButton() {
	loginBtn.click();
}
public void doLogin(String uName, String password) {
	enterUserName(uName);
	enterPassword(password);
	clickLoginButton();
}
}



