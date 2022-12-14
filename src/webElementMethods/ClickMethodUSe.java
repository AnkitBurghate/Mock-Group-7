package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethodUSe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		checkBox1.click();
		
		WebElement checkBox2 = driver.findElement(By.id("checkBoxOption2"));
		checkBox2.click();
		
		WebElement checkBox3 = driver.findElement(By.id("checkBoxOption3"));
		checkBox3.click();
	}

}
