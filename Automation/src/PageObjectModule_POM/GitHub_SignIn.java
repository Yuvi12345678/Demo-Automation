package PageObjectModule_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_SignIn {
	
	@FindBy(xpath="//a[@class='d-inline-block d-lg-none f5 no-underline border color-border-default rounded-2 px-2 py-1 mr-3 mr-sm-5 color-fg-inherit']") private WebElement SI;//declaration
	//WebElement SI = driver.FindElement(By.xpath("//input[@id='ap_email']"));
	
	public GitHub_SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this); //@FindBy - FindElement
		
	}
	public void email () {
		SI.click();
	}
	

}
