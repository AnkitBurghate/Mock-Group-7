package upStoxPOMUsingExcel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import screenshot.ScreenShot;
import scrolling.ScrollingGeneralize;

public class UpStoxHomePage {
	
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement userId;
	@FindBy(id = "funds")private WebElement fundsButton;
	@FindBy(xpath = "//div[text()='Logout']")private WebElement logoutButton;
	
	public UpStoxHomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	public void ValidateuserId(WebDriver driver,String expID) throws IOException {
		
		ScrollingGeneralize.scrollIntoView(driver, userId);
		
		String expectedUserId=expID;
		
		String actualUserId = userId.getText();
		
		ScreenShot.takeScreenshot(driver, actualUserId);
		
		if (actualUserId.equalsIgnoreCase(expectedUserId)) {
			
			System.out.println("actual and expected user id are matching, TC is passed");
			
		}else {
			
			System.out.println("actual and expected user id are not matching, TC is failed");
		}
	}
	
	public void clickOnFundsButton(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(1000);
		
		ScrollingGeneralize.scrollIntoView(driver, fundsButton);
		
		fundsButton.click();
		
		Thread.sleep(1000);

	}
	
	public void logoutFromApplication() throws InterruptedException{
		
		userId.click();
		
		Thread.sleep(500);
		
		logoutButton.click();
		

	}

}
