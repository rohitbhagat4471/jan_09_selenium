package AlertsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BasicUtility;

public class Ex2 {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "https://demoqa.com/alerts";
		WebDriver driver = bu.startUp("ch", url);
		driver.findElement(By.id("timerAlertButton")).click();
		if(bu.isAlertPresent(driver, 2)) {
			Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		}else {
			System.out.println("alert not displayed!!");
		}
		
	}

}
