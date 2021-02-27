package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
	WebDriver driver;
	 
	public void browserOpen() {
		

		//To identify browser on which test is executed
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
	    
		 ChromeOptions options=new ChromeOptions();
	     options.addArguments("--disable-notifications");                             
	     driver=new ChromeDriver(options);
	
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.manage().window().maximize();

}
}