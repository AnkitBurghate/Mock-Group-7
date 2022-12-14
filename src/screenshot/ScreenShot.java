package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	public static void takeScreenshot(WebDriver driver,String filename) throws IOException {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("D:\\Software Testing\\1.Automation Testing\\Selenium\\Notes\\automated Screenshot\\"+filename+".png");

		FileHandler.copy(source, Destination);

	}

}
