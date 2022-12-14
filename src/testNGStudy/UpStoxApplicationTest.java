package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpStoxApplicationTest {

	@Test
	public void validateUserName() {
		Reporter.log("User Name is validated", true);
	}

	@BeforeMethod
	public void loginToUpstoxApp() {
		Reporter.log("Enter UN, Enter PWD, Enter Passcode and Login To application", true);
	}

	@AfterMethod
	public void logOutFromUpstoxApplication() {
		Reporter.log("Click on Logout, Loggged out", true);
	}

	@BeforeClass
	public void launchBrowser() {
		Reporter.log("Launch browser and enter URL", true);
	}

	@AfterClass
	public void closeBroswer() {
		Reporter.log("Close broser ", true);
	}

}
