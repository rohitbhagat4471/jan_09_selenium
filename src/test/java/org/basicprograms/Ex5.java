package org.basicprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BasicUtility;

public class Ex5 {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.startUp("ch", url);
		String expUrl = "http://localhost:90/login.do";
		String actUrl = driver.getCurrentUrl();
		if (expUrl.equals(actUrl)) {
			System.out.println("url match");
		}else {
			System.out.println("url not match");
		}
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		
		String expDashUrl = "http://localhost:90/user/submit_tt.do";
		String actDashUrl = driver.getCurrentUrl();
		if (expDashUrl.equals(actDashUrl)) {
			System.out.println("url match");
		}else {
			System.out.println("url not match");
		}
			}
		
		
	}

