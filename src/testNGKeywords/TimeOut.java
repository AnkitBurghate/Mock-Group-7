package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
	@Test
	public void A() {
		Reporter.log("A TC is running", true);
	}

	@Test(timeOut = 2500)
	public void C() throws InterruptedException {
		Thread.sleep(2000);
		Reporter.log("C TC is running", true);
	}

	@Test
	public void D() {
		Reporter.log("D TC is running", true);
	}

	@Test
	public void B() {
		Reporter.log("B TC is running", true);
	}
}
