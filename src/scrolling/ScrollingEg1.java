package scrolling;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import screenshot.ScreenShot;

public class ScrollingEg1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			
		driver.get("https://www.ixigo.com/trains/train-seat-availability?utm_source=bing&utm_medium=paid_search_bing_trains&utm_campaign=train_search_desktop_bing&msclkid=8f5064f9858a1b971f0707ab9f82c001&utm_term=irctc%20login&utm_content=Ad%20group%201/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(40,1500)");// middle of the page
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(40,3000)");//bottom of the web page.
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(40,-1500)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(40,-750)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(40,-3000)");// top of the page
//		
		ScreenShot.takeScreenshot(driver, "WEbTable");
//		
		
	}

}
