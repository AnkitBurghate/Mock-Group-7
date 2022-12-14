package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/alerts/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("commit")).click();
		Thread.sleep(1000);
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();
		Thread.sleep(1000);
		
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2200);
		
		
		
		alt.dismiss();
		Thread.sleep(1000);
	
	
		
		
		
		

	}

}
