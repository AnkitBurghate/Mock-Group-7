package excelSheetHandling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

	
		File myFile = new File("D:\\Software Testing\\1.Automation Testing\\Selenium\\file_example_XLS_10.xls");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("class");
		
		System.out.println("=========================================================");
		
		//how to read complete single row
		
		for(int i=0;i<=3;i++) {
			
			String firstrow = mySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(firstrow+" ");
		}System.out.println();
		
		System.out.println("=========================================================");
		
		//how to read complete single cell/column
		
		for(int i=0;i<=1;i++) {
			String firstcell = mySheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(firstcell+" ");
		}

	}

}
