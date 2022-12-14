package desiredCapabilities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import screenshot.ScreenShot;

public class Justdial {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		
		// create object of chromeOptions
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		opt.addArguments("--disable-notifications");
		//opt.addArguments("incognito");
		//opt.addArguments("headless");
		WebDriver driver= new ChromeDriver(opt);
			
		driver.get("https://www.justdial.com/");
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@id='srchbx']")).sendKeys("Amaravati");
		driver.findElement(By.xpath("//button[@class='search-button']")).click();
		ScreenShot.takeScreenshot(driver, "chromeoptions");
		

	}

}
