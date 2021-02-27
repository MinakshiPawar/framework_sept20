package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class KiteLoginTest1 extends BaseClass {
	
	
	org.apache.poi.ss.usermodel.Sheet sh;
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	int TCID;
	
	
	@BeforeClass public void openBrowser() throws EncryptedDocumentException, IOException {
        browserOpen();
        login1=new KiteLogin1Page(driver);
        login2=new KiteLogin2Page(driver);
        home=new KiteHomePage(driver);
	}
	
	@BeforeMethod public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException {
        
		
	    login1.setKiteLogin1PageUsername(Utility.getTestData(0,0));
		Thread.sleep(2000);
		
		login1.setKiteLogin1PagePassword(Utility.getTestData(0,1));
		Thread.sleep(2000);

	    login1.clickKiteLogin1PageLoginButton();
		Thread.sleep(2000);
		
		login2.setKiteLogin2PagePin(Utility.getTestData(0,2));
			
		login2.ClickKiteLogin2PageContinue();
		
	
		}
	
	@Test public void VerifyProfileName() throws EncryptedDocumentException, IOException {
		
		TCID=200;
		String actResult = home.getKiteHomePageProfileName();
		String expResult=Utility.getTestData(0,3);
		
		
	
	
		Assert.assertEquals(actResult, expResult,"act and exp results are not same");
		
		
	}
	
	@AfterMethod public void logoutFromApp(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
		Utility.captureScreenshot(driver,TCID);
		}
	}

	
	@AfterClass public void CloseBrowser() {
		driver.close();
	}
}
