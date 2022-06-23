package org.testNGEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.utilities.BasicUtility;

public class ParametersEx1 {
	@Parameters({"browserName","userName","password")
  @Test
  public void loginMethod(String bName, String uName, String pwd) {
	  BasicUtility bu = new BasicUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver= bu.startUp(bName,url);

		driver.findElement(By.cssSelector("input[id='username']")).sendKeys(uName);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#loginButton>div")).click();
  }
}
