package upStox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import screenshot.ScreenShot;
import scrolling.ScrollingGeneralize;

public class ValidateUserNameAndFundsUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		
		//read data from excel sheet
		
		File myfile = new File("D:\\Software Testing\\1.Automation Testing\\Selenium\\23rd July Morng B.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("upstox");
		
		//login to application
		//sending UserId
		
		String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
		
		driver.findElement(By.name("userId")).sendKeys(UN);
		
		//sending password
		
		driver.findElement(By.name("password")).sendKeys(mysheet.getRow(0).getCell(1).getStringCellValue());
		
		//click on sign in button
		
		driver.findElement(By.id("submit-btn")).click();
		Thread.sleep(1500);
		//sending passcode
		driver.findElement(By.id("yob")).sendKeys(mysheet.getRow(0).getCell(2).getStringCellValue());
		
		
		//click on im not good button
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		
		//navigating to homepage
		Thread.sleep(1000);
		
		//validate user name
		
		String expextedUN="Eshwar T.";
		WebElement userNameField = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]"));
		
		//Scrolling into view
		Thread.sleep(500);
		ScrollingGeneralize.scrollIntoView(driver, userNameField);
		
		String actualUserName=userNameField.getText();
		
		ScreenShot.takeScreenshot(driver, actualUserName);
		
		if (expextedUN.equals(actualUserName)) {
			
			System.out.println("Actual and Expected UserNames are matching, TC passed");
			
			}else {
				
				System.out.println("Actual and Expected UserNames are not matching, TC failed");
			}
		
		//validate funds
		//clicking on funds button
		driver.findElement(By.id("funds")).click();
		
		Thread.sleep(1000);
		
		String funds = driver.findElement(By.xpath("((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]")).getText();
	
		System.out.println("Available Funds to trade is "+funds);
		
		driver.close();
		
		

	}

}
