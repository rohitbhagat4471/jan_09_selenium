package org.myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BasicUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	BasicUtility bu  = new BasicUtility();
	WebDriver driver;
	@Parameters("browserName")
	@BeforeTest
	public void setupBrowser(String browser) {
		
		if (browser.equalsIgnoreCase("ch")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else {
			System.out.println("Invalid Browser");
		}
	}
	@Test
	public void Login() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".button")).click();
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		bu.waitForVisibilityOfLocatedBy(driver, "xpath", "//a[text()='Logout']", 10);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
}
