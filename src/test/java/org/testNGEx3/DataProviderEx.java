package org.testNGEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utilities.BasicUtility;

public class DataProviderEx {
	@Test(dataProvider="loginCredentials")
	public void login(String userName, String password) {
		System.out.println(userName);
		System.out.println(password);
		BasicUtility bu = new BasicUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver= bu.startUp("ch",url);

		WebElement uNameF =driver.findElement(By.cssSelector("input[id='username']"));
		uNameF.sendKeys(userName);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(password);
		driver.findElement(By.cssSelector("#loginButton>div")).click();
	}
	@DataProvider
public Object[][] loginCredentials(){
	Object [][] data = new Object[3][2];
	data [0][0]="admin";
	data [0][1]="manager";
	
	data [1][0]="admin1";
	data [1][1]="mnager";
	
	data [2][0]="admin";
	data [2][1]="mnager1";
	return data;
}
}
