package tcs;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\New folder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("oneplus");
	Thread.sleep(3000);
	
String exp="oneplus 7";
	List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	//driver.get("https://www.amazon.in/");
for (WebElement option : alloptions) {
	String act=option.getText();
	if (exp.equals(act)) {
		
		option.click();
		break;
	}
	
}
}}
