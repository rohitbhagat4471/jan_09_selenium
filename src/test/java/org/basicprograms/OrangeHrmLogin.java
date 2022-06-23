package org.basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BasicUtility;

public class OrangeHrmLogin {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url= "https://opensource-demo.orangehrmlive.com/";
		WebDriver driver= bu.startUp("ch", url);
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".button")).click();
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		bu.waitForVisibilityOfLocatedBy(driver, "xpath", "//a[text()='Logout']", 10);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		

	}

}
