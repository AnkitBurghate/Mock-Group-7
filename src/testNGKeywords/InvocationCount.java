package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test(invocationCount = 5)
  public void A() {
	  
	  Reporter.log("A Test case is running", true);
  }
}
