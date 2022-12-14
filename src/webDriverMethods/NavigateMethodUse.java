package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.redbus.in/");
		
		Thread.sleep(1100);
		
		driver.navigate().back();
		
		Thread.sleep(1100);
		
		driver.navigate().forward();
		
		Thread.sleep(1200);
		
		driver.navigate().refresh();
	}

}
