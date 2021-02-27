package Dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_Review {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.get("http://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 8");
	
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(3000);
	
	String text = driver.findElement(By.xpath("(((//div[@class='col col-7-12'])[1]//span[@class='_2_R_DZ']/span/span)[1])")).getText();
	
	System.out.println(text);
}
}