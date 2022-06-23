package org.toolQAListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(ListenersInTestNG1.class)
public class ListenersEx1 {
WebDriver driver = null;
@BeforeSuite
public void startUp() {
	System.out.println("***Before Suite***");
	String path = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
	driver= new ChromeDriver();
	
}
@Test
public void closeBrowser() {
	System.out.println("close broser");
	driver.close();
	Reporter.log("Driver closed after testing");
}
@Test
public void openBrowser() {
	Reporter.log("Trying to hit URL");
	driver.get("https://www.demoqa.com");
	String expTitle = "Free QA Automation Tool For Everyone";
	String actTitle= driver.getTitle();
	Assert.assertEquals(expTitle, actTitle,"Title matched");
}
@AfterSuite
public void tearDown() {
	System.out.println("after suite");
	Reporter.log("--After Suite--");
	driver.quit();
}
//private static int i=1;
//@Test(successPercentage=100,invocationCount=3)
//public void AccountTest() {
//	if (i<=3) {
//		Assert.assertTrue(i<=2);
//	}
//	i++;
//}
//@Test
//public void skipTest() {
//	throw new SkipException("skipping test method");
//	
//}

}
