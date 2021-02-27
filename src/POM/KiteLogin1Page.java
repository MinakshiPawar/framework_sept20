package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page  {
	
	
	//Declaration of web elements
	@FindBy(xpath="//input[@id='userid']")
	private WebElement UN;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement PWD;
	
	@FindBy(xpath="//button[@class='button-orange wide']")
    private WebElement login;
	
	
	//Initialization
	
	public KiteLogin1Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Usage of WebElements
	
	public void setKiteLogin1PageUsername(String username) {
		UN.sendKeys(username);
	}	
	
	public void setKiteLogin1PagePassword(String password) {
		PWD.sendKeys(password);
	}
		
		public void clickKiteLogin1PageLoginButton() {
			login.click();
		}
	
	
}
