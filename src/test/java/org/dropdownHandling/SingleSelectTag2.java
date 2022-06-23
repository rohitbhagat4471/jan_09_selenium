package org.dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BasicUtility;

public class SingleSelectTag2 {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.startUp("ch", url);
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);

		WebElement singledd= driver.findElement(By.cssSelector("#oldSelectMenu"));
		Select sel = new Select(singledd);
		WebElement selectedOption =sel.getFirstSelectedOption();
		String SelectedClr= selectedOption.getText();
		System.out.println("seelected clr:"+SelectedClr);
		
		sel.selectByVisibleText("Purple");
		selectedOption =sel.getFirstSelectedOption();
		String userSelectedclr = selectedOption.getText();
		System.out.println("userSelectedclr:"+userSelectedclr);
	}

}
