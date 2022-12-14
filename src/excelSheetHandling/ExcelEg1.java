package excelSheetHandling;


import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myFile = new File("D:\\Software Testing\\1.Automation Testing\\Selenium\\23rd July Morng B.xlsx");
		
		String value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value1);
		
		String value2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(value2);
		
		String value3 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		
		System.out.println(value3);
		
		String value4 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
		
		System.out.println(value4);
		
		String value5 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(value5);
		
		String value6 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(value6);
		
		String value7 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(value7);
		
		String value8 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		
		System.out.println(value8);
	}

}
