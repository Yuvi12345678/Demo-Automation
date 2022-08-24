package DDF_POM_TESTING_BASE_UTILITY_CLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 {
	
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement Pwd;
	@FindBy(xpath="//button[contains(text(),'Login ')]") private WebElement Login;
	
	
	public KiteLoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void username() {
		UN.sendKeys("RO1243");
	}
	public void password() {
		Pwd.sendKeys("Yuvi@12345");
	}
	public void login() {
		Login.click();
	}
	
	
	
	

}
