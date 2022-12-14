package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		1. Open browser with amazon webpage
		
		driver.get("https://www.amazon.in/");
		
//		2. Wait for 1 second and change the position of browser x-axis=400 and y-axis=200
		Thread.sleep(1000);
		
		Point p = new Point(400, 200);
		
		driver.manage().window().setPosition(p);
		
//		3. Wait for 2 second and maximize window
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
//		4. Verify amazon webpage opened
		
		String expectedTitle ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		if (driver.getTitle()!= null && driver.getTitle().contains(expectedTitle)) {
			
			System.out.println("Amazon Web Pagec is Opened, TC is Passed");
			
		}else {
			System.out.println("Amazon Web Pagec is Not Opened, TC is Failed");
		}
		
//		5.  Wait for 2 sec and navigate to flipkart
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		
		
//		6. Wait for 2 sec and navigate to Google
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		
//		7 wait for 2 sec and navigate to Facebook
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		
//		8. Wait for 2 sec and navigate back to amazon
		Thread.sleep(2000);
		
		for(int i=0;i<=2;i++) {
			
			driver.navigate().back();
		}
//		9. Wait for 2 second and change size of browser to 700 width and 700 height
		
		Dimension d = new Dimension(700, 700);
		
		driver.manage().window().setSize(d);
		
//		10. Wait for 2 sec and navigate forward to Facebook
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		
//		11. Verify Facebook webpage opened
		String fbTitle="Facebook – log in or sign up";
		
		if (driver.getTitle() != null && driver.getTitle().contains(fbTitle)) {
			
			System.out.println("Facebook Web Page is Opened, TC is Passed");
			
		} else {
			
			System.out.println("Facebook Web Page is Not Opened, TC is Failed");

		}
		
//		12. Refresh webpage
		
		driver.navigate().refresh();
		
//		13. Wait for 2 seconds and close the browser
		
		Thread.sleep(2000);
		
		driver.close();



	}

}
