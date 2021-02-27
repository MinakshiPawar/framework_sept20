package tcs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5 {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\New folder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung tv");
	Thread.sleep(3000);
	String exp = "samsung tv 55 inch";
	
	List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='s-suggestion']"));
	
	for (WebElement option : alloptions) {
		String act = option.getText();
		
		if(exp.equals(act)) {
			option.click();
			break;
		}
		
	}
Thread.sleep(3000);
	//driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal'])[3]")).click();
	
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
	
	//driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[25]")).click();
	
	driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[18]")).click();
	Thread.sleep(3000);
}
}
