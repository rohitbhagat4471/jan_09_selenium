package org.dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BasicUtility;

public class MultiSelectTagGetOptions {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.startUp("ch", url);
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
	

		WebElement multidd= driver.findElement(By.cssSelector("#cars"));
		bu.waitForElementToBeClickable(driver, multidd, 10);
	//	bu.getAllTextFromDD(multidd); generic method
		
		
		Select sel = new Select(multidd);
		List<WebElement> allOpions =sel.getOptions();
		String str= "";
		for (int i=0;i<allOpions.size();i++) {
			str= allOpions.get(i).getText();
			System.out.println(str);
			if (str.equals("Audi")) {
				sel.selectByIndex(i);
			}
		}
		
	

	}

}
