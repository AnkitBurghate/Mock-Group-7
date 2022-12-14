package excelSheetHandling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myFile = new File("D:\\Software Testing\\1.Automation Testing\\Selenium\\file_example_XLS_10.xls");
		
		 double v1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
		
		System.out.print(v1+"|");
		
			String v2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
			
				System.out.print(v2+"|");
			
			 	String v3 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
				
				System.out.print(v3+"|");
				
				String v4 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
				
				System.out.print(v4+"|");
				
				String v5 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(4).getStringCellValue();
				
				System.out.print(v5+"|");
				
				String v6 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(5).getStringCellValue();
				
				System.out.print(v6+"|");
				
				String v7 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(6).getStringCellValue();
				
				System.out.print(v7+"|");
				
				String v8 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(7).getStringCellValue();
				
				System.out.println(v8+"|");

				 double v9 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
				
				System.out.println(v9+"|");
			
			
		
		


	}

}
