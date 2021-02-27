package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1 {

	

	@Test(groups="orders") public void TC5() {
		Reporter.log("Running TC5",true);
	}
	
	@Test(groups="orders") public void TC6() {
		Reporter.log("Running TC6",true);
	}
	
	@Test(groups="funds") public void TC7() {
		Reporter.log("Running TC7",true);
	}
	
	@Test(groups="funds") public void TC8() {
		Reporter.log("Running TC8",true);
	}
}
