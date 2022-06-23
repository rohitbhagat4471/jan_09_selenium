package org.myPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeTheScreenShotEx {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:90/login.do");
	driver.manage().window().maximize();
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src= ts.getScreenshotAs(OutputType.FILE);
	File trg = new File (".\\Screenshots\\homepage.png");
	FileUtils.copyFile(src, trg);
	
	// specific portion
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//	driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
//	driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
//	driver.findElement(By.cssSelector("#loginButton>div")).click();
//	
//	
// WebElement section = driver.findElement(By.id("addPreviousWeekAllTasksButton"));
// File src = section.getScreenshotAs(OutputType.FILE);
// File trg = new File (".\\Screenshots\\sections.png");
// FileUtils.copyFile(src, trg);
// 

	}

}
