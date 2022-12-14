package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewWindow")).click();
		
		String mainPageID = driver.getWindowHandle();
		
		System.out.println(mainPageID);
		
		Set<String> allPageIDs = driver.getWindowHandles();
		
		for(String p:allPageIDs) {
			
			System.out.println(p);
		}
		Iterator<String> it = allPageIDs.iterator();
		
		String mainPageIDN = it.next();
		String childPageID = it.next();
		
		driver.switchTo().window(childPageID);
		
		driver.manage().window().maximize();
		
//		driver.close();
//		driver.quit();
		driver.findElement(By.id("the7-search")).sendKeys("Ankit");
		
		driver.switchTo().window(mainPageIDN);
		
		String myText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
		
		System.out.println("Home Page TExt--> "+myText);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		

	}

}
