package SerialParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void phonepeLaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phonepe.com/");
		Thread.sleep(1000);
	}
}
