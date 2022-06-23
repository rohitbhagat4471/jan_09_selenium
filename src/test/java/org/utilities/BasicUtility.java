package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicUtility {

	public WebDriver startUp(String bName,String url) {
		//String path = System.getProperty("user.dir");
		WebDriver driver=null;
		switch (bName) {
		case "ch":
		case "CH":
		case "chrome":
		//	System.setProperty("webdriver.chrome.driver", path+"\\drivers\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "ff":
		case "FF":
		case "firefox":
		//	System.setProperty("webdriver.gecko.driver", path+"\\drivers\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;
		case"edge":
		case"EDGE":
			//System.setProperty("webdriver.edge.driver", path+"\\drivers\\msedgedriver.exe");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default: System.out.println("invalid browser");

		}
		//driver.manage().window().minimize();
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(400,500));
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		return driver;

	}
	public void waitForVisibiltyOElement(WebDriver driver,WebElement ele, int time) {
		WebDriverWait wt= new WebDriverWait (driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.visibilityOf(ele));
	}
	public void waitForVisibilityOfLocatedBy(WebDriver driver, String locType, String locator, int time) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		switch(locType) {
		case "xpath": wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		break;
		case "css": wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
		break;
		case"id": wt.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
		break;
		case"class": wt.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
		break;
		}

	}
	public void waitForElementToBeClickable(WebDriver driver,WebElement ele, int time) {
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.elementToBeClickable(ele));


	}
	public void presenceOfElementLocated(WebDriver driver,String locType,String locator, int time) {
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
		switch (locType) {
		case "xpath":
			wt.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
			break;
		case "css":
			wt.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));
			break;
		case "id":
			wt.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
			break;	
		case "class":
			wt.until(ExpectedConditions.presenceOfElementLocated(By.className(locator)));
			break;
		}

	}
	public void waitForInvisibilityOfElement(WebDriver driver,WebElement ele,int time) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		wt.until(ExpectedConditions.invisibilityOf(ele));
		//return true when  element is not visible anymore
	}
	public ArrayList<String> getAllTextFromDD(WebElement ele){
		Select sel = new Select (ele);
		ArrayList<String> ar = new ArrayList<String>();
		for (int i=0;i<sel.getOptions().size();i++) {
			ar.add(sel.getOptions().get(i).getText());
			sel.selectByIndex(i);
		}
		System.out.println(ar);
		return ar;
	}
	public void dragAndDrop(WebDriver driver ,WebElement src, WebElement dest) {
		Actions act = new Actions (driver);

		act.dragAndDrop(src, dest).perform();

	}
	public void dragAndDropByXYCord(WebDriver driver,WebElement src, int xcord, int ycord) {
		Actions act = new Actions (driver);
		act.dragAndDropBy(src, xcord, ycord).perform();

	}
	public void clickAndHold(WebDriver driver ,WebElement src, WebElement dest) {
		Actions act = new Actions (driver);
		act.clickAndHold(src).moveToElement(dest).release().build().perform();
	}
	public void click(WebDriver driver , WebElement ele) {
		Actions act = new Actions (driver);
		act.click(ele).perform();
	}
	public void rightClick(WebDriver driver , WebElement ele) {
		Actions act = new Actions (driver);
		act.contextClick(ele).perform();
}
	public void doubleClick(WebDriver driver , WebElement ele) {
		Actions act = new Actions (driver);
		act.doubleClick(ele).perform();
	}
	public void sendKeys(WebDriver driver , WebElement ele, String text) {
		Actions act = new Actions (driver);
		act.sendKeys(ele, text).perform();
	}
	public boolean isAlertPresent(WebDriver driver, int time) {
		try {
			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
			wt.until(ExpectedConditions.alertIsPresent());
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	public void getAllTypeOfDataFromExcelSheet(String path, String sheet) throws IOException {
		 FileInputStream fis = new FileInputStream(path);
			
			Workbook wb = WorkbookFactory.create(fis);
		
			Sheet s1=wb.getSheet(sheet);
			
			for (int i=1;i<=s1.getLastRowNum();i++) {
		
			for(int j=0;j<s1.getRow(i).getLastCellNum();j++) {
			CellType ct =s1.getRow(i).getCell(j).getCellType();
		
				switch (ct) {
				case STRING:
					System.out.println(s1.getRow(i).getCell(j).getStringCellValue());
					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(s1.getRow(i).getCell(j))){
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
						System.out.println(sdf.format(s1.getRow(i).getCell(j).getDateCellValue()));
						break;
			
					}else {
						System.out.println( s1.getRow(i).getCell(j).getNumericCellValue());
						break;
						}
				case BOOLEAN:
					System.out.println(s1.getRow(i).getCell(j).getBooleanCellValue());
					break;
					
				case FORMULA:
					System.out.println(s1.getRow(i).getCell(j).getCellFormula());
					break;
				case BLANK:
					System.out.println("Cell is Blank!!");
					default:
			System.out.println("invalid cell!!!");
				}
			}
			
			}
	
	}
	public void scrollTillElementByJS(WebElement ele, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true)",ele);
	}
	public void clickByJS (WebElement ele, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()",ele);
	}
	public void TakeScreenShot(WebDriver driver,String dest) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File trg = new File (".\\Screenshots\\"+dest);
		try {
			FileUtils.copyFile(src, trg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}