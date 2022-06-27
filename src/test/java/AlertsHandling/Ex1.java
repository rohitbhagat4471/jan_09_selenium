package AlertsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BasicUtility;

public class Ex1 {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "https://demoqa.com/alerts";
		WebDriver driver = bu.startUp("ch", url);
		driver.findElement(By.id("promtButton")).click();
		Alert alt =driver.switchTo().alert();
		System.out.println(alt.getText()); // for gettext of alert
		alt.sendKeys("rohitB");// for send text
		alt.accept();// for click on yes, accept and ok 
	//	alt.dismiss();
	 	
	 	
	}

}
