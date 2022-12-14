package iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/frames");
		Thread.sleep(1000);
		
	    driver.switchTo().frame("frame1");// switching selenium focus from main page to iFrame
	    
	   WebElement myElement = driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]"));
			
		System.out.println(myElement.getText());
		
		driver.switchTo().defaultContent();
		
		WebElement mainpageElement = driver.findElement(By.xpath("//div[@class='main-header']"));
		
		System.out.println(mainpageElement.getText());

	}

}
