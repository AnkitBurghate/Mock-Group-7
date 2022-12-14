package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethodUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(5000);
		
		
		WebElement Sign_InButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		Thread.sleep(1500);
		Sign_InButton.click();
		
		WebElement GetOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		boolean result1 = GetOTPButton.isEnabled();
		
		System.out.println("Get OTP Button is "+result1);
		
		WebElement mobileNumField = driver.findElement(By.name("mobileNumber"));
		
		mobileNumField.sendKeys("8888888888");
		Thread.sleep(100);
		
		boolean result2 = GetOTPButton.isEnabled();
		
		System.out.println("Get OTP Button is "+result2);
		
		GetOTPButton.click();
		
		driver.manage().window().minimize();
		Thread.sleep(500);

	}

}
