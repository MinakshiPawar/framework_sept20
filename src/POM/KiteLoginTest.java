package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


//POM with  DDF
public class KiteLoginTest {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
	
	
		//To import data from excel
		FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\Selenium\\Excel\\Sept20.xlsx");
		 org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(file).getSheet("DDF");

		//To identify browser on which test is executed
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();


		//To handle login 1 page
		
		KiteLogin1Page login1=new KiteLogin1Page(driver);
		
	    String UN=sh.getRow(0).getCell(0).getStringCellValue();
		login1.setKiteLogin1PageUsername(UN);
		
		
		String PWD=sh.getRow(0).getCell(1).getStringCellValue();
		login1.setKiteLogin1PagePassword(PWD);
		
		
	    login1.clickKiteLogin1PageLoginButton();
		Thread.sleep(3000);
		
				
		//To handle login2 page
		KiteLogin2Page login2=new KiteLogin2Page(driver);
		String PIN=sh.getRow(0).getCell(2).getStringCellValue();
			login2.setKiteLogin2PagePin(PIN);
			
		login2.ClickKiteLogin2PageContinue();
		
		//To handle login3(Home) page
		KiteHomePage home=new KiteHomePage(driver);
		String exp=sh.getRow(0).getCell(3).getStringCellValue();
		home.setKiteHomePageProfileName(exp);
		
		Thread.sleep(5000);
		driver.close();
		
}}
