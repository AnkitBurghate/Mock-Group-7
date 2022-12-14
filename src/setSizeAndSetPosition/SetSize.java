package setSizeAndSetPosition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SetSize {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		Dimension defaultSize = driver.manage().window().getSize();
		
		System.out.println("Default Size of window is "+defaultSize);
		
		//to set the size we need to use Dimension class
		//create object of Dimension class and pass width and height
		
		Dimension d = new Dimension(750,748);
		
		// now set the size
		//use setSize method and pass Dimension class object as parameter
		Thread.sleep(1000);
		driver.manage().window().setSize(d);
		
		Thread.sleep(1000);
		Dimension d1= new Dimension(1900, 748);
		driver.manage().window().setSize(d1);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination= new File("D:\\Software Testing\\1.Automation Testing\\Selenium\\Notes\\automated Screenshot\\myShot.png");
		
		FileHandler.copy(source, destination);

	}

}
