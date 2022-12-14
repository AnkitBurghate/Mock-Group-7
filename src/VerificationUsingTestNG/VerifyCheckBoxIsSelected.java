package VerificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyCheckBoxIsSelected {
	@Test
	public void testing() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);

		WebElement checkBox = driver.findElement(By.id("checkBoxOption1"));
//		if (checkBox.isSelected()) {
//			
//			Reporter.log("Check box is selected TC is Passed", true);
//
//		}else {
//			Reporter.log("Check box is not selected TC is failed", true);
//
//		}
		 
	}
}
