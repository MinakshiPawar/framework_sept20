package Scroll_UP_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_UP_Down {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement closebutton = driver.findElement(By.xpath("//div[@id='closeBtn']"));
		if (closebutton.isDisplayed()) {
			closebutton.click();
			
		}
		Thread.sleep(3000);
		
		//down--> 2nd parameter +ve value
		
		((JavascriptExecutor)driver).executeScript("Window.ScrollBy(0,1000)");
		Thread.sleep(3000);
		

		//down--> 2nd parameter -ve value
		
		((JavascriptExecutor)driver).executeScript("Window.ScrollBy(0,-500)");
		Thread.sleep(3000);
		

		//down--> 1st parameter +ve value
		
//		((JavascriptExecutor)driver).executeScript("Window.ScrollBy(300,0)");
//		Thread.sleep(3000);
		

		//down--> 1st parameter -ve value
		
//		((JavascriptExecutor)driver).executeScript("Window.ScrollBy(-300,0)");
//		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//div[@class='canvas-middle'])[11]")).click();
		
		driver.quit();
	}
	
}
