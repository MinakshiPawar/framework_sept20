package Verification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class _assert {

	//1. Assert Equals
	
//	@Test public void TC1() {
//		Reporter.log("Running TC1");
//	
//	String act="abc";
//	String exp="abc1";
//	
//	Assert.assertEquals(act, exp, "act and exp results are not same");
//	}
//	
	
	//2.assert Not Equals 
	
//	@Test public void TC1() {
//		Reporter.log("Running TC1");
//	
//	String act="abc";
//	String exp="abc";
//	
//	Assert.assertNotEquals(act, exp, "act and exp results are same");
//	}
//	
	
	// 3.assert True
//	@Test public void TC1() {
//		Reporter.log("Running TC1");
//	boolean actresult=false;
//		
//		Assert.assertTrue(actresult,"radio button not selected");
//	}
	
	// 4.assert false
//		@Test public void TC1() {
//			Reporter.log("Running TC1");
//		boolean actresult=true;
//			
//			Assert.assertFalse(actresult,"radio button is selected");
//		}
	
	// 5.assert null
//		@Test public void TC1() {
//			Reporter.log("Running TC1");
//		boolean actresult="abc";
//			
//			Assert.assertNull(actresult,"act result is not null");
//		}
	
	// 6.assert Notnull
		@Test public void TC1() {
			Reporter.log("Running TC1");
		Object actresult = null;
			
			Assert.assertNotNull(actresult,"act result is null");
		}
	
}
