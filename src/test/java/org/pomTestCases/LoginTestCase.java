package org.pomTestCases;
import org.openqa.selenium.WebDriver;
import org.pompages.LoginPage;
import org.propertiesOperations.ConfigReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.utilities.BasicUtility;

public class LoginTestCase {
private WebDriver driver;
private ConfigReader cr;
BasicUtility bu = new BasicUtility();
@BeforeSuite
public void initializeObjects() {
	cr= new ConfigReader();
}
@BeforeMethod
public void initializeBrowser() {
	driver = bu.startUp(cr.getPropData("browserName"), cr.getPropData("url"));
}
@Test
public void  verifyLoginPage() {
	LoginPage lp=new LoginPage(driver);
	lp.verifyLoginPage();
}
 @Test
 public void login() {
	 LoginPage lp=new LoginPage(driver);
lp.enterUserName(cr.getPropData("userName"));
lp.enterPassword(cr.getPropData("password"));
lp.clickLoginButton();
 }
 @AfterMethod
 public void tearDown() {
	
	// driver.close();
 }
}
