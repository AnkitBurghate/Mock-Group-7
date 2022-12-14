package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test(dependsOnMethods = { "B" }, priority = -1)
	public void A() {
		Reporter.log("A TC is running", true);
	}

	@Test
	public void C() throws InterruptedException {
		Reporter.log("C TC is running", true);
	}

	@Test
	public void D() {
		Reporter.log("D TC is running", true);
	}

	@Test
	public void B() {
		// Assert.fail();
		Reporter.log("B TC is running", true);
	}
}