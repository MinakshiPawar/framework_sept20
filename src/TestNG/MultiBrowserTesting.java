package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTesting {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void TC(String browser) throws InterruptedException {
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
	
			
			driver=new ChromeDriver();
					
		}
		
		else if (browser.equals("firefox"))
		{
			
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
			
		 driver=new FirefoxDriver();	
		}
		
		else if(browser.equals("ie")) {
			
		}
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
			driver.close();
		}
	}
	
	
		
	
	

