package TestNG;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExecuteFailedTC {

	@Test public void TC1() {
		Reporter.log("Running TC1",true);
	}
	

	@Test public void TC2() {
//		Assert.fail();
		Reporter.log("Running TC1",true);
	}
	
}
