package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUse {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
//		driver.get("https://www.flipkart.com/");
//		
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Samsung Mobiles");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement userID = driver.findElement(By.xpath("//input[@id='email']"));
		
		userID.sendKeys("Ankit");
		Thread.sleep(1100);
		userID.clear();
		Thread.sleep(1000);
		userID.sendKeys("Burghate");
		Thread.sleep(2000);
		
		driver.close();

		
		
		
		
		
	}

}
