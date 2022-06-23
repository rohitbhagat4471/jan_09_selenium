package org.dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BasicUtility;

public class WithoutSelectTag {

	public static void main(String[] args) {
	BasicUtility bu = new BasicUtility();
	String url = "https://demoqa.com/select-menu";
	WebDriver driver = bu.startUp("ch", url);

	WebElement ddBtn = driver.findElement(By.xpath("(//div[@class=' css-1wa3eu0-placeholder'])[1]"));
		//	WebElement ddBtn = driver.findElement(By.cssSelector(".css-yk16xz-control .css-1hwfws3"));
	ddBtn.click();
	bu.waitForElementToBeClickable(driver, ddBtn, 10);
	System.out.println(driver.getPageSource());
	driver.findElement(By.xpath("//*[text()='Group 1, option 1']")).click();

	}

}
