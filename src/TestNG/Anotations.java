package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Anotations {

 @BeforeClass public void OpenBrowser() {
		System.out.println("Open Browser");
	}
		
 
		@BeforeMethod public void loginToApp() {
			System.out.println("login To App---");
		}
		
			@Test public void TC1() {
	            Reporter.log("running TC1",true);
			}
			
			@Test public void TC2() {
				Reporter.log("running TC2",true);
			}
			
		@AfterMethod public void logoutFromApp() {
				System.out.println("logout From App--");
			}
			
			
	@AfterClass public void closeBrowser() {
		System.out.println("close Browser");
			}
			
		
		
		
	}


