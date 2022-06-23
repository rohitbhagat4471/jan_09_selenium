package org.excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class PrintAllTypeDataValues {

	public static void main(String[] args) throws IOException {
		//this commented section for generic method:
//		BasicUtility bu = new BasicUtility();
//	String path="./excelFiles/TestData.xlsx";
//	String sheetName="AllDataTypes";
//	bu.getAllTypeOfDataFromExcelSheet(path, sheetName);

		 FileInputStream fis = new FileInputStream("./excelFiles/TestData.xlsx");
	
			Workbook wb = WorkbookFactory.create(fis);
		
			Sheet s1=wb.getSheet("AllDataTypes");
			
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

}
