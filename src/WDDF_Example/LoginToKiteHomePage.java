package WDDF_Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginToKiteHomePage {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
	

	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	WebDriver driver=new ChromeDriver(options);
	
	
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	
	//Enter username
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
	
	
	//Enter password
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vijay@123");
	
	//To click on login button
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	Thread.sleep(2000);
	
	//To enter pin
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
	
	//To click on continue
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	
	
	//To verify profile name on kite Home page
	String act=driver.findElement(By.xpath("//span[text()='KV']")).getText();
	String exp="KV";
	
	
	if (act.equals(exp)) {
		System.out.println("Pass");
		
	} else {
		System.out.println("Fail");

	}
	
	Thread.sleep(2000);
	driver.close();
}


	
	}
	

