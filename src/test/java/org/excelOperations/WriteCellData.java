package org.excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.utilities.BasicUtility;

public class WriteCellData {

	public static void main(String[] args) throws IOException {

		System.out.println("program starts");
		FileInputStream fis = new FileInputStream("./excelFiles/TestData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet s1=wb.getSheet("WriteCellData");

//		for (int i=1;i<=s1.getLastRowNum();i++) {
//			s1.getRow(i).createCell(4).setCellValue("pass");
//		}
		s1.getRow(1).createCell(4).setCellValue("Pass");
		s1.getRow(2).createCell(4).setCellValue("Fail");
		s1.getRow(3).createCell(4).setCellValue("Pass");
		FileOutputStream fos = new FileOutputStream("./excelFiles/TestData.xlsx");
		wb.write(fos);
		fos.close();

		System.out.println("program ends");

	}

}
