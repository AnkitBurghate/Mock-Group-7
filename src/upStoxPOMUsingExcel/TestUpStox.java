package upStoxPOMUsingExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUpStox {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://login-v2.upstox.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		//reading data from excel sheet
		
		File myfile = new File("D:\\Software Testing\\1.Automation Testing\\Selenium\\23rd July Morng B.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("upstox");
		
		// create object of login page
		
		UpStoxLoginPage login = new UpStoxLoginPage(driver);
		
		login.sendUserId(mySheet.getRow(0).getCell(0).getStringCellValue());
		
		login.sendPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		
		login.clickOnSignInButton();
		
		// create obj of passcode page
		
		Thread.sleep(1500);
	
		UpStoxPasscodePage passcode = new UpStoxPasscodePage(driver);
		
		passcode.enterPasscode(mySheet.getRow(0).getCell(2).getStringCellValue());
		
		// create object of UpstoxWelcome Page
		Thread.sleep(4000);
		UpStoxWelcomePage welcome = new UpStoxWelcomePage(driver);
		welcome.clickOnNoImGoodButton();
		
		//create an object of upstoxHomePage 
		Thread.sleep(1000);
		UpStoxHomePage home= new UpStoxHomePage(driver);
		
		home.ValidateuserId(driver,mySheet.getRow(0).getCell(3).getStringCellValue());
		home.clickOnFundsButton(driver);
		
		//create an object of UpstoxFundPage
		Thread.sleep(1000);
		UpStoxFundsPage funds = new UpStoxFundsPage(driver);
		funds.checkavailableFunds();
		home.logoutFromApplication();
		
		
		driver.close();

	}

}
