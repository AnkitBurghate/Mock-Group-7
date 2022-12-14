package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_ContextClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		//1.
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//2.
		Actions act = new Actions(driver);
		
		//3.
		act.moveToElement(rightClickButton).perform();
		act.contextClick().perform();

	}

}
