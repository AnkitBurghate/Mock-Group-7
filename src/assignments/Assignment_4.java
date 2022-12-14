package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		1. Open YouTube website.
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);

//		2. Identify search box and enter value as Software Testing.
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Software Testing");

//		3. Click on search button.
		driver.findElement(By.id("search-icon-legacy")).click();

		Thread.sleep(10000);
//		4. Start any video for 50 seconds
		WebElement video = driver.findElement(By.xpath(
				"//yt-formatted-string[@aria-label='Software Testing Full Course In 10 Hours | Software Testing Tutorial | Edureka by edureka! Streamed 1 year ago 10 hours, 18 minutes 1,126,975 views']"));

		video.click();
		Thread.sleep(50000);

//		5. Navigate back.
		driver.navigate().back();
		Thread.sleep(2000);
//		6. Clear text from search box and enter value as selenium.
		driver.findElement(By.xpath("//input[@id='search']")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Selenium");

//		7. Click on search button.
		driver.findElement(By.id("search-icon-legacy")).click();

//		8. Start any video for 50 seconds
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//yt-formatted-string[@aria-label='Selenium Full Course - Learn Selenium in 12 Hours | Selenium Tutorial For Beginners | Edureka by edureka! 2 years ago 11 hours, 37 minutes 1,398,332 views']"))
				.click();
		Thread.sleep(50000);

	}

}
