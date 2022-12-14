package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("incognito","start-maximized");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='Amritsar']")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
		driver.findElement(By.xpath("//div[text()='Delhi']")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'])[19]")).click();

	
		
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click();

		WebElement adult = driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"));
		
		int i=1;
		while (i<=7) {
			
			adult.click();
			i++;
			
		}
		Thread.sleep(2000);
		
		WebElement children = driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']"));
		
		for(int j=1;j<=4;j++) {
			
			children.click();
		}
		Thread.sleep(2000);
		
		WebElement Infant = driver.findElement(By.xpath("//div[@data-testid='Infant-testID-plus-one-cta']"));
		
		for(int j=1; j<=4; j++) {
			
			Infant.click();
		}
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[6]")).click();
		driver.findElement(By.xpath("//div[text()='USD']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		
		
		
	}

}
