package org.testNGEx1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.utilities.BasicUtility;

public class ActiveTimeLogin1 {
	private WebDriver driver;
	BasicUtility bu = new BasicUtility();
@Test(priority=1)
	public void openBrowser(){

		String url = "http://localhost:90/login.do";
		driver =	bu.startUp("ch",url);
	}
@Test(priority=2)
	public void doLogin() {

		WebElement uNameF =driver.findElement(By.cssSelector("input[id='username']"));
		uNameF.sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton")).click();
	}
@Test(priority=3)
	public void doLogout() {
	bu.waitForVisibilityOfLocatedBy(driver, "css", "#logoutLink", 10);
	
		driver.findElement(By.cssSelector(".logout")).click();



	}

}
