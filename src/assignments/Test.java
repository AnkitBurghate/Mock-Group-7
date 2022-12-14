package assignments;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import screenshot.ScreenShot;
import scrolling.ScrollingGeneralize;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("incognito","start-maximized");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement calender = driver.findElement(By.xpath("//input[@type='date']"));
		
		ScrollingGeneralize.scrollIntoView(driver, calender);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("20112000");
	
		ScreenShot.takeScreenshot(driver, "calender");
		
	}

}
