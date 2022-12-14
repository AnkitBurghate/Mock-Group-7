package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import scrolling.ScrollingGeneralize;

public class UpStoxHomePage {
	
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement userId;
	@FindBy(id = "funds")private WebElement fundsButton;
	@FindBy(xpath = "//div[text()='Logout']")private WebElement logoutButton;
	
	public UpStoxHomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	public void ValidateuserId(WebDriver driver) {
		
		ScrollingGeneralize.scrollIntoView(driver, userId);
		
		String expectedUserId="Eshwar T.";
		
		String actualUserId = userId.getText();
		
		if (actualUserId.equalsIgnoreCase(expectedUserId)) {
			
			System.out.println("actual and expected user id are matching, TC is passed");
			
		}else {
			
			System.out.println("actual and expected user id are not matching, TC is failed");
		}
	}
	
	public void clickOnFundsButton() {
		
		fundsButton.click();
	}
	
	public void logoutFromApplication() throws InterruptedException{
		
		userId.click();
		
		Thread.sleep(500);
		
		logoutButton.click();
		

	}

}
