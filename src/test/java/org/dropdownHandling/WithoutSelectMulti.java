package org.dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BasicUtility;

public class WithoutSelectMulti {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.startUp("ch", url);
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		
		WebElement ddBtn = driver.findElement(By.xpath("(//div[@class=' css-2b097c-container']//div[@class=' css-1hwfws3'])[3]"));
		
		ddBtn.click();
		bu.waitForElementToBeClickable(driver, ddBtn, 10);
		

		
		driver.findElement(By.xpath("//div[text()='Green']")).click();
		driver.findElement(By.xpath("//div[text()='Blue']")).click();
		driver.findElement(By.xpath("//div[text()='Red']")).click();


	}

}
