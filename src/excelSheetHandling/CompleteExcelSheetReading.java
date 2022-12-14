package excelSheetHandling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CompleteExcelSheetReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myFile = new File("D:\\Software Testing\\1.Automation Testing\\Selenium\\file_example_XLS_10.xls");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		int totalNumOfrow = mySheet.getLastRowNum();
		int totalNumofCell = mySheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=totalNumOfrow;i++) {
			
			for(int j=0;j<=totalNumofCell;j++) {
				
				CellType CellType = mySheet.getRow(i).getCell(j).getCellType();
				
				if(CellType==org.apache.poi.ss.usermodel.CellType.STRING) {
					
					String value = mySheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value+"|");
				}
				else if (CellType==org.apache.poi.ss.usermodel.CellType.NUMERIC) {
					
					double value = mySheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(value+"|");
					
					
				}
				
				
			}System.out.println();
		}
		

	}

}
