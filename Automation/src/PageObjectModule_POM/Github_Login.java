package PageObjectModule_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_Login {
	
	@FindBy(xpath="//input[@id='login_field']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	@FindBy(xpath="//input[@value='Sign in']") private WebElement Signup;
	
	public Github_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setGithubLoginUsername() {
		UN.sendKeys("shindey340@gmail.com");
	}
	public void setGithubLoginPassword() {
		PWD.sendKeys("Yuvi@123");
	}
	public void setGithubSignIn() {
		Signup.click();
	}

}
