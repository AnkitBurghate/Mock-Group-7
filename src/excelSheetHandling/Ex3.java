package excelSheetHandling;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myFile = new File("D:\\Software Testing\\1.Automation Testing\\Selenium\\file_example_XLS_10.xls");
		
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		
		Sheet mySheet = myWorkbook.getSheet("Sheet1");
		
		Row myrow = mySheet.getRow(0);
		
		Cell myCell = myrow.getCell(0);
		
		CellType CellDataType = myCell.getCellType();
		
		System.out.println("Cell Data type is "+CellDataType);
		
		
			}
		
		

	}


