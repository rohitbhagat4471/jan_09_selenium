package org.basicprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BasicUtility;

public class Ex4 {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.startUp("ch", url);
		String expTitle = "actiTIME - Login";
		String actTitle = driver.getTitle();
		if (expTitle.equals(actTitle)) {
			System.out.println("Title match");
		}else {
			System.out.println("title not match");
		}
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		WebElement ele =null;
		String attribValue="";
		List<WebElement> tabList= driver.findElements(By.xpath("//table[@class='navTable']//td/a[contains(@class,'content')]"));
		for (int i=0;i<tabList.size();i++) {
			ele= tabList.get(i);
			System.out.println(tabList.get(i).getText());
			attribValue=ele.getAttribute("class");
			if(attribValue.contains(" selected")) {
				System.out.println(ele.getText());
				
			}
		}
		
	}
}
