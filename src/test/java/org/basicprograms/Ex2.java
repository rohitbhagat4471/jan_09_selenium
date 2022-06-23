package org.basicprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex2 {
	String path = System.getProperty("user.dir");
	WebDriver driver;


	public static void main(String[] args) {
		Ex2 obj= new Ex2();
		obj.openBrowser("ff");

	}
	public WebDriver openBrowser(String bName) {
		switch (bName) {
		case "ch":
		case "CH":
		case "chrome":
			System.setProperty("webdriver.chrome.driver", path+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "ff":
		case "FF":
		case "firefox":
			System.setProperty("webdriver.gecko.driver", path+"\\drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
			break;
		case"edge":
		case"EDGE":
			System.setProperty("webdriver.edge.driver", path+"\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		default: System.out.println("invalid browser");

		}
		return driver;
	}
}
