package org.basicprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BasicUtility;

public class FlipkartLogin {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "https://www.flipkart.com/";
		WebDriver driver= bu.startUp("ch",url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("poco f1");
		driver.findElement(By.cssSelector(".L0Z3Pu")).click();
		
		

	}

}
