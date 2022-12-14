package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {

	@Test
	public void A() {
		System.out.println("A method is running");
		Reporter.log("A method running using--:log");
		Reporter.log("A method running using--:log true", true);
	}

	@Test
	public void B() {
		System.out.println("B method is running");
		Reporter.log("B method running using--:log");
		Reporter.log("B method running using--:log true", true);
	}

}
