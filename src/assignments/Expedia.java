package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Expedia {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.expedia.ca/");
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[@id=\"location-field-destination-menu\"]/div[1]/div[1]/button")).click();
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//*[@id=\"location-field-destination\"]")).sendKeys("Delhi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[4]/td[6]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[5]/td[4]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/button")).click();
		
		driver.findElement(By.xpath("//button[@data-testid='submit-button']")).click();



	}

}
