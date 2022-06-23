package org.fileUploadDownload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BasicUtility;

public class Ex1 {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "https://demoqa.com/automation-practice-form";
		WebDriver driver = bu.startUp("ch", url);
		WebElement uploadBtn = driver.findElement(By.cssSelector(".form-control-file"));
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        //bu.scrollTillElementByJS(uploadBtn, driver);
		bu.clickByJS(uploadBtn, driver);
		
		try {
			Thread.sleep(2000);
			Runtime.getRuntime().exec("./AutoitFiles/ChromeUpload.exe");
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}

}
