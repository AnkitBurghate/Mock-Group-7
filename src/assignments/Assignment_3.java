package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
//		1. Open browser with Facebook webpage
		
		driver.get("https://www.facebook.com/");
		
//		2. Wait for 2 second and miximize window 
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
//		3. Wait for 1 second and change size of browser to 1000 width and 700 height
		Thread.sleep(1000);
		Dimension d = new Dimension(1000, 700);
		driver.manage().window().setSize(d);
		
//		4. Display title and URL of webpage
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
//		5.  Wait for 2 sec and navigate to flipkart
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		
//		6. Refresh webpage
		driver.navigate().refresh();
		
//		7. wait for 2 second and change position of browser
		
		Point p = new Point(190, 10);
		driver.manage().window().setPosition(p);
		
//		8. Wait for 2 sec and navigate back to Facebook
		Thread.sleep(2000);
		driver.navigate().back();
		
//		9. Verify Facebook webpage opened
		
		String fbTitle="Facebook – log in or sign up";
		
		if (driver.getTitle() != null && driver.getTitle().contains(fbTitle)) {
			
			System.out.println("Facebook Web Page is Opened, TC is Passed");
			
		} else {
			
			System.out.println("Facebook Web Page is Not Opened, TC is Failed");

		}
		
//		10. Refresh webpage
		driver.navigate().refresh();
		
//		11. Wait for 2 seconds and close the browser
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
