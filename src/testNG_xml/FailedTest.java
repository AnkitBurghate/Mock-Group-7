package testNG_xml;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTest {
	@Test
	public void A() {

		Reporter.log("A TC is running", true);
		;
	}

	@Test
	public void B() {

		Reporter.log("B TC is running", true);
		;
	}

	@Test
	public void C() {

		Reporter.log("C TC is running", true);
		;
	}

	@Test
	public void D() {

//		Assert.fail();
		Reporter.log("D TC is running", true);
		;
	}

	@Test
	public void E() {
		Assert.fail();

		Reporter.log("E TC is running", true);
		;
	}

	@Test
	public void F() {

		Reporter.log("F TC is running", true);
		;
	}
}
