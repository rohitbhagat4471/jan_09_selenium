package org.frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BasicUtility;

public class Ex1 {

	public static void main(String[] args) {
	BasicUtility bu = new BasicUtility();
	String url = "https://demoqa.com/frames";
	WebDriver driver = bu.startUp("ch", url);
	WebElement frame1 =driver.findElement(By.id("frame1"));
	driver.switchTo().frame(frame1);
	String text = driver.findElement(By.id("sampleHeading")).getText();
	System.out.println("text ="+text);
	driver.switchTo().defaultContent();
	
//	WebElement frame2 =driver.findElement(By.id("frame1"));
//	driver.switchTo().frame(frame1);  OR
	// alternate method is:
	driver.switchTo().frame("frame2");
	String text1 = driver.findElement(By.id("sampleHeading")).getText();
	System.out.println("text1 ="+text1);
	}

}
