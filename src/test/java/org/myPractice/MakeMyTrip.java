package org.myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BasicUtility;

public class MakeMyTrip {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url ="https://www.makemytrip.com/";
		WebDriver driver = bu.startUp("ch", url);
		WebElement dd =driver.findElement(By.cssSelector("label[for='fromCity']"));
		dd.click();
		bu.waitForElementToBeClickable(driver, dd, 10);	
	driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();

	WebElement dd2 =driver.findElement(By.cssSelector("input[placeholder='To']"));
	bu.waitForElementToBeClickable(driver, dd, 10);	
	dd2.click();
	
	
	driver.findElement(By.xpath("//p[text()='Bangkok, Thailand']")).click();
	
	WebElement dep =driver.findElement(By.xpath("(//span[@class='lbl_input latoBold appendBottom10'])[1]"));
	bu.waitForElementToBeClickable(driver, dep, 10);

	dep.click();
	driver.findElement(By.cssSelector("//p[text()='12047']")).click();
	}

}
