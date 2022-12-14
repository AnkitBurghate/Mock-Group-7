package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		
		WebElement Source = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		act.dragAndDrop(Source, target).perform();
		Thread.sleep(4000);
	
		WebElement Source1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement target1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		act.dragAndDrop(Source1, target1).perform();
		Thread.sleep(3000);

	}

}
