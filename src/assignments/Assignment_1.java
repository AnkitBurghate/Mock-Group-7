package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\1.Automation Testing\\Selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//1.Open browser with Google webpage
		
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		String expectedTitle = "Google";
		
		
//		2.Verify Google webpage opened 
		
//		driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
		
		if (driver.getTitle() != null && driver.getTitle().contains(expectedTitle)) {
			
			System.out.println("Web page is opened,Test Case is Passed");
			
		}else {
			System.out.println("Web page is not opened,Test Case is Failed");
		}
		
		Thread.sleep(2000);
		
//		3.Wait for 2 second and change size of browser to 700 width and 700 height
		
		Dimension d = new Dimension(700, 700);
		
		driver.manage().window().setSize(d);
		
		
//		4.Wait for 2 second and minimize the browser
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
//		5. Wait for 2 second and maximize browser
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
//		6. Close the browser
		Thread.sleep(2500);
		
		driver.close();
		
		
		
	}

	
	

}
