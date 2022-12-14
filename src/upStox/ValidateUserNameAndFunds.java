package upStox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import scrolling.ScrollingGeneralize;

public class ValidateUserNameAndFunds {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		
		//login to application
		//sending UserId
		
		driver.findElement(By.name("userId")).sendKeys("4YB8VB");
		
		//sending password
		
		driver.findElement(By.name("password")).sendKeys("Esh@7551gm");
		
		//click on sign in button
		
		driver.findElement(By.id("submit-btn")).click();
		Thread.sleep(1200);
		//sending passcode
		driver.findElement(By.id("yob")).sendKeys("1993");
		
		
		//click on im not good button
		Thread.sleep(4000);
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
