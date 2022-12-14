package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxPasscodePage {
	
//1.Variable declaration
	
	@FindBy(id="yob")private WebElement passcodeField;
	
//2. variable initialization by using constructor
	
	public UpStoxPasscodePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
//3. usage
	
	public void enterPasscode() {
		
		passcodeField.sendKeys("1993");
	}
}
