package org.propertiesOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static void main(String[] args)  {
		FileInputStream fis;
		try {
			fis = new FileInputStream("./propertiesFiles/Config.properties");
			Properties prop = new Properties();
			prop.load(fis);
			System.out.println("url:"+prop.getProperty("url"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public String getPropData (String key)  {
		String file = "./propertiesFiles/Config.properties";
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fis);
			return prop.getProperty(key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		return null;
		
	}
}
