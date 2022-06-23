package org.basicprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BasicUtility;

public class ActiveLoginFF {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver =bu.startUp("edge", url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		driver.findElement(By.cssSelector(".logout")).click();
		
	}

}
