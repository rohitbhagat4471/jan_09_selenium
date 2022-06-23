package org.windowHandling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BasicUtility;

public class GenericSwitch2 {

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
				List<WebElement> listele = driver.findElements(By.id("sampleHeading"));
				if(!listele.isEmpty()) {
				String text=	listele.get(0).getText();
		System.out.println(text);
		break;
				}
			}System.out.println("searching for element");
		}
		
	
		
	}

}
