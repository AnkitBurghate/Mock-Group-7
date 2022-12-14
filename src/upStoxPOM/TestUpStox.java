package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUpStox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		
		// create object of login page
		
		UpStoxLoginPage login = new UpStoxLoginPage(driver);
		login.enterUserId();
		login.enterPassword();
		login.clickOnSignInButton();
		
		// create obj of passcode page
		
		Thread.sleep(1500);
	
		UpStoxPasscodePage passcode = new UpStoxPasscodePage(driver);
		
		passcode.enterPasscode();
		
		// create object of UpstoxWelcome Page
		Thread.sleep(4000);
		UpStoxWelcomePage welcome = new UpStoxWelcomePage(driver);
		welcome.clickOnNoImGoodButton();
		
		//create an object of upstoxHomePage 
		Thread.sleep(1000);
		UpStoxHomePage home= new UpStoxHomePage(driver);
		
		home.ValidateuserId(driver);
		home.clickOnFundsButton();
		
		//create an object of UpstoxFundPage
		Thread.sleep(1000);
		UpStoxFundsPage funds = new UpStoxFundsPage(driver);
		funds.checkavailableFunds();
		home.logoutFromApplication();
		
		
		driver.close();

	}

}
