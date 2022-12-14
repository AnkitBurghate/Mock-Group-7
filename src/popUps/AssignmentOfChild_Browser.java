package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOfChild_Browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		
		Set<String> allPageID = driver.getWindowHandles();
		
		Iterator<String> it = allPageID.iterator();
		String HOMEPAGE = it.next();
		String PRACTICE_PAGE = it.next();
		
		driver.switchTo().window(PRACTICE_PAGE);
		
		driver.findElement(By.name("radio")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("autocomplete")).sendKeys("Good Luck");
		Thread.sleep(1000);
		
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropDown);
		
		s.selectByVisibleText("Option2");
		Thread.sleep(1000);
		driver.findElement(By.name("checkBoxOption3")).click();
		Thread.sleep(1000);
		driver.switchTo().window(HOMEPAGE);
		
		String homePageText = driver.findElement(By.xpath("//h3[text()='For Velocity class inquiry please contact on below numbers']")).getText();
		
		driver.manage().window().minimize();
		System.out.println(homePageText);
		System.out.println(" ☎️ - 9579631733/ 9579625219/ 9529509089/");
		
		Thread.sleep(2500);
		driver.quit();
	}

}
