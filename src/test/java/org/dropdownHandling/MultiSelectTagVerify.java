package org.dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BasicUtility;

public class MultiSelectTagVerify {

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
        List<WebElement> allSelOption = sel.getAllSelectedOptions();
        for (int i=0;i<allSelOption.size();i++) {
        	System.out.println(allSelOption.get(i).getText());
        }

	}

}
