package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethodUSe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
		
		boolean result1 = checkBox1.isSelected();
		
		System.out.println("Check box selection status is "+result1);
		
		checkBox1.click();
		boolean result2 = checkBox1.isSelected();
		System.out.println("Check box selection status is "+result2);

	}

}
