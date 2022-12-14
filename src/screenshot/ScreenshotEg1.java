package screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotEg1 {

	public static void main (String[]arg) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://c.ndtvimg.com/2021-09/4i2ojf9g_ganesh-chaturthi-unsplash_625x300_07_September_21.jpg");

	  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		System.out.println(source);

		File Destination = new File("D:\\Software Testing\\1.Automation Testing\\Selenium\\Notes\\automated Screenshot\\myScreenshot.png");
		
		org.openqa.selenium.io.FileHandler.copy(source, Destination);
		
		}

}
