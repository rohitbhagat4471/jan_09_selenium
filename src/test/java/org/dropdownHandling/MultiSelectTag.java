package org.dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BasicUtility;

public class MultiSelectTag {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.startUp("ch", url);
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
	

		WebElement multidd= driver.findElement(By.cssSelector("#cars"));
		bu.waitForElementToBeClickable(driver, multidd, 10);
		Select sel = new Select(multidd);
		sel.selectByVisibleText("Volvo");
		sel.selectByIndex(2);
        sel.selectByValue("audi");
        String fileName = "dropD2.png";
        bu.TakeScreenShot(driver, fileName);

	}

}
