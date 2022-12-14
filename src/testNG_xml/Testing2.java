package testNG_xml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing2 {
	@Test(groups = "un")
	public void E() {
		Reporter.log("E TC is running", true);
	}

	@Test
	public void F() throws InterruptedException {
		Reporter.log("F TC is running", true);
	}

	@Test(groups = "un")
	public void G() {
		Reporter.log("G TC is running", true);
	}

	@Test(groups = "funds")
	public void H() {
		Reporter.log("H TC is running", true);
	}
}
