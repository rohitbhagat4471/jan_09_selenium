package org.actionClassEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BasicUtility;

public class ToolTipEx {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "https://demoqa.com/tool-tips";
		WebDriver driver = bu.startUp("ch", url);

		WebElement btn = driver.findElement(By.cssSelector("#toolTipButton"));
		Actions act = new Actions (driver);
		act.moveToElement(btn).perform();
		String tooltip = driver.findElement(By.cssSelector(".tooltip-inner")).getText();
		System.out.println(tooltip);
		
		WebElement textfld = driver.findElement(By.cssSelector(".mr-sm-2.form-control"));
		bu.waitForVisibiltyOElement(driver, textfld, 5);
		act.moveToElement(textfld).perform();
		String textfldtip = driver.findElement(By.cssSelector(".tooltip-inner")).getText();
		System.out.println(textfldtip);
		
		
	}
}