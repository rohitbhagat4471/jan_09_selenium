package org.windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.utilities.BasicUtility;

public class GenericSwitch {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "https://demoqa.com/browser-windows";
		WebDriver driver = bu.startUp("ch", url);
		
		String parentid1= driver.getWindowHandle();
		
		driver.findElement(By.id("windowButton")).click();

		Set<String> allwinids= driver.getWindowHandles();
		Iterator <String> itr = allwinids.iterator();
		while(itr.hasNext()) {
			String id= itr.next();
			if(!id.equals(parentid1)) {
				driver.switchTo().window(id);
				try {
					String text = driver.findElement(By.id("sampleHeading")).getText();
					System.out.println("text="+text);
					break;
					
		}catch(NoSuchElementException e) {
			e.printStackTrace();
			
		}
			}
		}
		
	
		
	}

}
