package tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class sample2 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//driver.navigateto().("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Actions act=new Actions(driver);
		//act.moveToElement(month).click();
//		act.click(month).perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.ARROW_UP).perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(3000);
		act.moveToElement(month).click();
		for (int i = 1; i <=13; i++) {
act.sendKeys(Keys.ARROW_UP).perform();
Thread.sleep(3000);
		}
		for (int i = 1; i <=9; i++) {
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(3000);
		}
		act.sendKeys(Keys.ENTER).perform();

	}
}
