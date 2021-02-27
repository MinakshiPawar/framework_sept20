package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {

	//Declaration of WebElement
	
	@FindBy(xpath="//input[@id='pin']")
	private WebElement pin;
	
	@FindBy(xpath="//button[@class='button-orange wide']")
	private WebElement cnt;
	
	
	//Initialization
	
	public KiteLogin2Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	
	public void setKiteLogin2PagePin(String pinValue) {
	pin.sendKeys(pinValue);	
	}
	
	
	public void ClickKiteLogin2PageContinue() {
		cnt.click();
	}
	
	
	
	
	
	
}
