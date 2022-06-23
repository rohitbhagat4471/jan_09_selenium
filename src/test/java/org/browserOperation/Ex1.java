package org.browserOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BasicUtility;

public class Ex1 {

	public static void main(String[] args) {
	BasicUtility bu = new BasicUtility();
	String url = "https://www.google.com";
	WebDriver driver = bu.startUp("ch", url);
	
	driver.navigate().to("https://www.facebook.com");
	
	driver.navigate().back();
	
	driver.navigate().forward();
;
	driver.navigate().refresh();
	
			

	}

}
