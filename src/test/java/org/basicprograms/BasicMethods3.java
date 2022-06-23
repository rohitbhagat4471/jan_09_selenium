package org.basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BasicUtility;

public class BasicMethods3 {

	public static void main(String[] args) {
	BasicUtility bu  = new BasicUtility();
	String url = "https://demoqa.com/radio-button";
	WebDriver driver = bu.startUp("ch", url);
	WebElement noBtn = driver.findElement(By.cssSelector("#noRadio"));
	System.out.println("enabled:"+noBtn.isEnabled());
	
	WebElement yesLabel= driver.findElement(By.cssSelector("label[for='yesRadio']"));
	System.out.println("displayed :"+yesLabel.isDisplayed());
	bu.waitForElementToBeClickable(driver, yesLabel, 20);
	yesLabel.click();
	WebElement yesBtn = driver.findElement(By.cssSelector("#yesRadio"));
	System.out.println("selected :"+yesBtn.isSelected());
	
	
	

	}

}
