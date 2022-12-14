package myPackage;	

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Automation Testing\\Selenium\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	      
	// Launch web site  
	    driver.navigate().to("http://www.google.com/");
	    
	    driver.findElement(By.className("M6CB1c rr4y5c")).click();
	          
	    // Click on the search text box and send value  
	    driver.findElement(By.name("q")).sendKeys("flipkart");
	    
	 
	          
	    // Click on the search button  
	    driver.findElement(By.name("btnK")).click();  

	}

}
