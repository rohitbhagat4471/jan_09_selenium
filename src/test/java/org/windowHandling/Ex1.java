package org.windowHandling;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BasicUtility;

public class Ex1 {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "https://demoqa.com/browser-windows";
		WebDriver driver = bu.startUp("ch", url);
		String parentid1= driver.getWindowHandle();
		System.out.println("parentid1: "+parentid1);
		driver.findElement(By.id("tabButton")).click();
		String parentid2= driver.getWindowHandle();
		System.out.println("parentid2: "+parentid2);

		Set<String> allwinids= driver.getWindowHandles();
		Iterator <String> itr = allwinids.iterator();
		String id1 = itr.next();
		System.out.println("id1:"+id1);
		String id2 = itr.next();
		System.out.println("id2:"+id2);
		driver.switchTo().window(id2);
		String sample = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(sample);

		//driver.quit(); it will close all tab which is open by this code
		driver.close();// use to close newly open window
		// but we have call driver to point out previous window
		driver.switchTo().window(parentid1);
		driver.close();
	}

}
