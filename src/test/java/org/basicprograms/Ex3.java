package org.basicprograms;

import org.openqa.selenium.WebDriver;
import org.utilities.BasicUtility;

public class Ex3 {

	public static void main(String[] args) {
		BasicUtility bu = new BasicUtility();
		String url = "https://www.google.co.in/";
		WebDriver driver = bu.startUp("ch",url);
		

	}

}
