package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleUse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().minimize();
		
		System.out.println(driver.getTitle());
		System.out.println("===================");
		
		String myTitle = driver.getTitle();
		
		System.out.println("My Title is "+myTitle);
		
		System.out.println("==================================================================");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println("===================================");
		
		String URL = driver.getCurrentUrl();
		System.out.println("My URL is "+URL);

	}

}
