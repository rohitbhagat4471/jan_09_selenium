package org.excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex1 {

	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream("./excelFiles/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			int totalSheets = wb.getNumberOfSheets();
			System.out.println("totalSheets:"+totalSheets);
			int sheetIndex = wb.getSheetIndex("AllStringTypes");
			System.out.println("sheetIndex:"+sheetIndex);
			String sheetName = wb.getSheetName(1);
			System.out.println("sheetName:"+sheetName);
			for(int i=0;i<totalSheets;i++) {
				System.out.println(wb.getSheetName(i));
			}
			
			
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		}

}
