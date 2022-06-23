package org.testNGEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.utilities.BasicUtility;

public class InvocationEx3 {
	@Test(invocationCount =3,threadPoolSize=4)
	public void login() {
		BasicUtility bu = new BasicUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver= bu.startUp("ch",url);

		WebElement uNameF =driver.findElement(By.cssSelector("input[id='username']"));
		uNameF.sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
	}

}
