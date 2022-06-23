package org.frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BasicUtility;

public class Ex2 {

	public static void main(String[] args) {
	BasicUtility bu = new BasicUtility();
	String url = "https://demoqa.com/nestedframes";
	WebDriver driver = bu.startUp("ch", url);
	WebElement frame1 =driver.findElement(By.id("frame1"));
	driver.switchTo().frame(frame1);
	WebElement child1 =driver.findElement(By.cssSelector("iframe[srcdoc='<p>Child Iframe</p>']"));
	driver.switchTo().frame(child1);
	String text= driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
	System.out.println("text:"+text);
	
	

	}

}
