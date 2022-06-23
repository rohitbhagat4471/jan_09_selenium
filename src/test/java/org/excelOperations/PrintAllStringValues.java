package org.excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllStringValues {

	public static void main(String[] args) throws IOException {
	
		//Step 1
		 FileInputStream fis = new FileInputStream("./excelFiles/TestData.xlsx");
		 //Step 2
			Workbook wb = WorkbookFactory.create(fis);
			//Step 3:Sheet
			Sheet s1=wb.getSheet("AllStringTypes");
//			int lastRowNum = s1.getLastRowNum();
//			System.out.println("lastRowNum:"+lastRowNum);
			
			//step 4: Row
			Row r1=s1.getRow(1);
//			int lastcellNum = r1.getLastCellNum();
//			System.out.println("lastcellNum:"+lastcellNum);
			
			//Step 5: cell
			Cell c1=r1.getCell(0);
			System.out.println(c1.getStringCellValue());
			Row r= null;
			Cell c= null;
			for (int i=1;i<=s1.getLastRowNum();i++) {
			r = s1.getRow(i);
			for(int j=0;j<r.getLastCellNum();j++) {
				c=r.getCell(j);
				System.out.println(c.getStringCellValue());
			}
			
			}
	
		
		}

}
