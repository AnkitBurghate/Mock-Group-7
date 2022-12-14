package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://paytm.com/");
		Thread.sleep(1000);
		driver.manage().window().minimize();
		
		WebElement text = driver.findElement(By.xpath("//h1[text()='Paytm Payment Instruments']"));
		
		String actualResult = text.getText();
		
		String expectedresult = "Paytm Payment Instruments";
		
		if(actualResult.equals(expectedresult)) {
			System.out.println("Test Case is Passed");
		}else {
			System.out.println("Test Case is Failed");
		}
		

	}

}
