package org.excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2 {

	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream("./excelFiles/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s1=wb.getSheet("AllStringTypes");
			int lastRowNum = s1.getLastRowNum();
			System.out.println("lastRowNum:"+lastRowNum);
			int physicalNumberOfRow = s1.getPhysicalNumberOfRows();
			System.out.println("physicalNumberOfRow:"+physicalNumberOfRow);
			
			Row r1=s1.getRow(1);
			int lastcellNum = r1.getLastCellNum();
			System.out.println("lastcellNum:"+lastcellNum);
			
			int  physicalNum = r1.getPhysicalNumberOfCells();
			System.out.println("physicalNum:"+physicalNum);
			
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		}

}
