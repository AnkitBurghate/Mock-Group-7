package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions act = new Actions(driver);
		Thread.sleep(1000);
//		act.clickAndHold(source).moveToElement(target).release().build().perform();
		act.dragAndDrop(source, target).perform();
		
		Thread.sleep(2000);
		
		WebElement Source1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		
		WebElement target1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(Source1, target1).perform();
		Thread.sleep(2000);
		
		
		
	}
	
	

}
