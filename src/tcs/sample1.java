package tcs;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class sample1 {
	
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\New folder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	//driver.navigateto().("https://www.amazon.in/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(3000);
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Select s=new Select(month);
	s.selectByVisibleText("Jan");
	//s.selectByIndex(6);
	//s.selectByValue("6");    
	System.out.println("------List of elements---------");
	List<WebElement> alloptions = s.getOptions();
	System.out.println(alloptions.size());
	Thread.sleep(2000);
	TreeSet tr=new TreeSet();
	for(WebElement ele : alloptions) {
	String text = ele.getText();
		System.out.println(text);
		
		tr.add(text);
	}
	System.out.println("-----after sorting-----------");
	for(Object ele1:tr) {
		System.out.println(ele1);
	}
	
	
	
	
}
}