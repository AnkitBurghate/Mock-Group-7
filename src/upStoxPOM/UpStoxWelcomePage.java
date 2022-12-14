package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxWelcomePage {
	
//1. variable declaration
	
	@FindBy(xpath = "//div[text()='No, I’m good']")private WebElement noIamGoodButton;
	
//2.variable initialize 
	
	public UpStoxWelcomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
//3.usage by using Methods
	
	public void clickOnNoImGoodButton() {
		
		noIamGoodButton.click();
	}

}
