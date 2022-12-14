package iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_iFrames {
	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(1000);
		
		WebElement mainPageElement = driver.findElement(By.xpath("//div[@class='main-header']"));
		
		System.out.println(mainPageElement.getText());
		
		driver.switchTo().frame("frame1");
		
		String parentText = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		
		System.out.println("Parent Frame Text is "+parentText);
		
		Thread.sleep(3000);
		
//		driver.switchTo().frame(15);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		
		Thread.sleep(3000);
		
		
		String childText = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		
		System.out.println("Child text is "+childText);
		
		driver.switchTo().defaultContent();//switching from child to main page
		
		System.out.println(mainPageElement.getText());
	}

}
