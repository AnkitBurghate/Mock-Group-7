//Ankit Burghate
package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();

		// System.out.println(driver.getWindowHandles());

		Set<String> allpageIDS = driver.getWindowHandles();

		for (String string : allpageIDS) {

			System.out.println(string);

		}
		Iterator<String> it = allpageIDS.iterator();

		String mainpageID = it.next();
		String nextpageID = it.next();
		String child = it.next();

		driver.switchTo().window(child);
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@id='subscribe-field-1']")).sendKeys("qatester@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().window(mainpageID);
		Thread.sleep(1000);

		driver.switchTo().window(nextpageID);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Blog");
		driver.findElement(By.xpath("//a[@class='submit']//*[name()='svg']")).click();
		Thread.sleep(1500);
		
		driver.quit();
	}

}
