package org.myPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.utilities.BasicUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		List <WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i =0;i<links.size();i++) {
			//by using href attribute we can get URL of required link
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			URL link = new URL(url);
			// create connection using url object 'link'
			HttpURLConnection httpConn = (HttpURLConnection)link.openConnection();
			Thread.sleep(2000);
			httpConn.connect();
			int rescode= httpConn.getResponseCode();
			if (rescode>=400) {
				System.out.println(url+" - is broken");
			}else {
				System.out.println(url+" - is valid");
			}

// just change for git hub practice
		}




	}

}
