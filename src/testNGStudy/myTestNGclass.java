package testNGStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class myTestNGclass {
  @Test
  public void googletest() throws InterruptedException {
	  	System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com/");
		
		driver.findElement(By.name("q")).sendKeys("vctcpune");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();
	  
  }
  @Test
  public void facebookTest() throws EncryptedDocumentException, IOException, InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		//read data from excel
		File myfile = new File("D:\\Software Testing\\1.Automation Testing\\Selenium\\23rd July Morng B.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("fblogin");
		WebElement uID = driver.findElement(By.id("email"));
		uID.sendKeys(mySheet.getRow(0).getCell(0).getStringCellValue());
		
		Thread.sleep(1200);
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(mySheet.getRow(0).getCell(1).getStringCellValue());
		
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
	  
  }
  @Test
  public void justdialTest() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
	  ChromeOptions opt= new ChromeOptions();
	  opt.addArguments("--disable-notifications");
	
	  WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		
		driver.get("https://www.justdial.com/");
	  
  }
}
