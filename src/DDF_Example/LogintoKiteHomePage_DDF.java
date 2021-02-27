package DDF_Example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LogintoKiteHomePage_DDF {


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
		
		
		//Enter username
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
				
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
		Thread.sleep(2000);
		
		//Enter password
		String pwd=sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		Thread.sleep(2000);
		
		//To click on login button
				driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		Thread.sleep(3000);
				
		//To enter pin
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
		
		//To click on continue
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		
		
		//To verify profile name on kite Home page
		String act=driver.findElement(By.xpath("//span[text()='KV']")).getText();
		String exp=sh.getRow(0).getCell(3).getStringCellValue();
		
		
		if (act.equals(exp)) {
			System.out.println("Pass");
			
		} else {
			System.out.println("Fail");

		}
		
		Thread.sleep(2000);
		driver.close();
	}
	
	
}

	


	
}
