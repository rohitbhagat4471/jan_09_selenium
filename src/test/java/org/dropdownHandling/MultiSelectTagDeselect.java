package org.dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BasicUtility;

public class MultiSelectTagDeselect {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.startUp("ch", url);
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
	

		WebElement multidd= driver.findElement(By.cssSelector("#cars"));
		bu.waitForElementToBeClickable(driver, multidd, 10);
	//	bu.getAllTextFromDD(multidd); generic method
		
		
		Select sel = new Select(multidd);
	
		for (int i=0;i<sel.getOptions().size();i++) {
			
					sel.selectByIndex(i);
			}
		sel.deselectAll();
//		sel.deselectByIndex(1);
//		sel.deselectByValue("audi");
//		sel.deselectByVisibleText("Opel");
//	

	}

}
