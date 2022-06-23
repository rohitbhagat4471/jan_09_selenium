package org.testNGEx2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.utilities.BasicUtility;

public class ParallelEx {
	BasicUtility bu = new BasicUtility();
	@Test
public void chromeLogin() {
	
	String url = "http://localhost:90/login.do";
	WebDriver driver= bu.startUp("ch",url);

	WebElement uNameF =driver.findElement(By.cssSelector("input[id='username']"));
	uNameF.sendKeys("admin");
	driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
	driver.findElement(By.cssSelector("#loginButton>div")).click();
}
	@Test
public void edgeLogin() {
	String url = "http://localhost:90/login.do";
	WebDriver driver= bu.startUp("edge",url);

	WebElement uNameF =driver.findElement(By.cssSelector("input[id='username']"));
	uNameF.sendKeys("admin");
	driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
	driver.findElement(By.cssSelector("#loginButton>div")).click();
}
}
