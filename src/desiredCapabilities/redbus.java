package desiredCapabilities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import scrolling.ScrollingGeneralize;

public class redbus {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		
		// create object of chromeOptions
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("headless");
		
		
		WebDriver driver= new ChromeDriver(opt);
			
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		
        WebElement text = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
 
        ScrollingGeneralize.scrollIntoView(driver, text);
        
        String actual = text.getText();
        
        System.out.println(actual);
        
		
		String expected= "Facebook helps you connect and share with the people in your life.";
		
		if (actual.equalsIgnoreCase(expected)) {
			
			System.out.println("TC is passed");
			
		}else {
			System.out.println("TC is failed");
		}
		//driver.manage().window().minimize();
	}

}
