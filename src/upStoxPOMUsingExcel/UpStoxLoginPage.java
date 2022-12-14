package upStoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxLoginPage {
	
	// 1.variable declaration
	
	@FindBy(name="userId")private WebElement userID;
	@FindBy(name="password")private WebElement password;
	@FindBy(xpath = "//div[text()='Sign into Upstox']")private WebElement signInButton;
	
	//2. Initializing Variable by using constructor--> PageFactory Class-->(method)-->initElements
	
	public UpStoxLoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	//3. variable usage by using methods
	
			public void sendUserId(String un) {
				
				userID.sendKeys(un);
			}
			public void sendPassword(String pwd) {
				
				password.sendKeys(pwd);
				
				
			}
			public void clickOnSignInButton() {
				
				signInButton.click();
			}
			

}
