package org.actionClassEx;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BasicUtility;

public class ClickRightClick {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "https://demoqa.com/links";
		WebDriver driver = bu.startUp("ch", url);
		Actions act = new Actions (driver);
		WebElement ele = driver.findElement(By.id("simpleLink"));
	
	// for simple click
		act.click(ele).perform();
		// for right click
		//act.contextClick(ele).perform();
		//for double click
		//act.doubleClick(ele).perform();
		//for open new window
		//act.keyDown(Keys.LEFT_CONTROL).click(ele).keyUp(Keys.LEFT_CONTROL).build().perform();
	}
}