package excelSheetHandling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myFile = new File("D:\\Software Testing\\1.Automation Testing\\Selenium\\file_example_XLS_10.xls");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("class");
		
		int lastRowNum = mySheet.getLastRowNum();
		
		System.out.println("Last Row Number is "+lastRowNum);
		
		int totalNumberofRows = lastRowNum;
		
		System.out.println("Total Number of Rows present in Sheet is "+totalNumberofRows);
		
		short lastCellNum = mySheet.getRow(0).getLastCellNum();
		
		System.out.println("Last cell Number is "+lastCellNum);
		/* here actual number of cell is printed but we want
		 * by indexing  for that we subtract one from it to get total number of cells present
		 * in sheet*/
		
		int totalNumOfCells = lastCellNum-1;
		
		System.out.println("total number of cells present in sheet is "+totalNumOfCells);
		System.out.println("================================================================");
		
		for(int i=0;i<=totalNumberofRows;i++) {
			
			for(int j=0;j<=totalNumOfCells;j++) {
				
				String values = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(values+" ");
			}System.out.println();
		}
		
		
		
	}

}
