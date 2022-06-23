package org.dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BasicUtility;

public class SingleSelectTag {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.startUp("ch", url);

		WebElement singledd= driver.findElement(By.cssSelector("#oldSelectMenu"));
		Select sel = new Select(singledd);
		sel.selectByVisibleText("Yellow");
		//sel.selectByIndex(8);
        //sel.selectByValue("10");

	}

}
