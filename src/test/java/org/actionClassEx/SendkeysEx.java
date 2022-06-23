package org.actionClassEx;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BasicUtility;

public class SendkeysEx {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "https://demoqa.com/text-box";
		WebDriver driver = bu.startUp("ch", url);
		Actions act = new Actions (driver);
		WebElement src = driver.findElement(By.id("userName"));

		act.sendKeys(src, "Rohit Bhagat").perform();
		
	}
}