package excelSheetHandling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg5 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myFile = new File("D:\\Software Testing\\1.Automation Testing\\Selenium\\file_example_XLS_10.xls");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("class");
		
		//outer loop for row varying from 0-1;
		
		for(int i=0;i<=1;i++) {
			
			//inner loop for cell/column varying from 0-3;
			for(int j=0;j<=3;j++) {
				
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}System.out.println();
		}
	}

}
