package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassUse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//using webElemnt method clicking on Element
		// WebElement homePageButton = driver.findElement(By.xpath("//a[text()='HOME ']"));
		// homePageButton.click();
		
		//using Actions class click on Element
		//1.Identify an Element and store in ref variable
		 
		WebElement homePageButton = driver.findElement(By.xpath("//a[text()='HOME ']"));
		
		//2. Create an object of Actions class and pass driver object
		
		Actions act = new Actions(driver);
		
		//3. Using one of the actions class method take action
			//1st way
//		act.moveToElement(homePageButton).perform();
//		act.click().perform();
			//2nd way
//		act.moveToElement(homePageButton).click().build().perform();
			//3rd way
		act.click(homePageButton).perform();
	}

}
