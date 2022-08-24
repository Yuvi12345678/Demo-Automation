package PageObjectModule_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_HomePage {
	
	@FindBy(xpath="(//summary[@role='button'])[2]") private WebElement button;
	@FindBy(xpath="//button[@class='dropdown-item dropdown-signout']") private WebElement Signout;
	
	public Github_HomePage(WebDriver driver) {
       PageFactory.initElements(driver, this);
	}

	public void button() {
		button.click();
	}
	public void Signout() {
		Signout.click();
	}
}
