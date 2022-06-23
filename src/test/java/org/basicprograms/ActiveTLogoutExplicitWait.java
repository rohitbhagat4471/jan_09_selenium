package org.basicprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BasicUtility;

public class ActiveTLogoutExplicitWait {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver= bu.startUp("ff",url);

		WebElement uNameF =driver.findElement(By.cssSelector("input[id='username']"));
		uNameF.sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		
	bu.waitForElementToBeClickable(driver, driver.findElement(By.cssSelector(".logout")), 10);
		driver.findElement(By.cssSelector(".logout")).click();

	}

}
