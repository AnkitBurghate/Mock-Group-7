package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test
	public void A() {
		Reporter.log("A TC is running", true);
	}

	@Test(enabled = false)
	public void C() {
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
