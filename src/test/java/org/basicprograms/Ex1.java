package org.basicprograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("***program start ****");
//		String path = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", path+"\\drivers\\chromedriver.exe");
//	ChromeDriver obj = new ChromeDriver();
		Ex1 obj = new Ex1();
		obj.testFF();
		//obj.testedge();
	System.out.println("***program end ****");
	}
public void testFF(){
	
	String path = System.getProperty("user.dir");
	System.setProperty("webdriver.gecko.driver", path+"\\drivers\\geckodriver.exe");
	FirefoxDriver obj = new FirefoxDriver();
	
}
public void testedge(){
	
	String path = System.getProperty("user.dir");
	System.setProperty("webdriver.edge.driver", path+"\\drivers\\msedgedriver.exe");
	EdgeDriver obj = new EdgeDriver();
	
}
}
