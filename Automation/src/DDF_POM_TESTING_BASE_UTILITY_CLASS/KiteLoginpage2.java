package DDF_POM_TESTING_BASE_UTILITY_CLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginpage2 {
	
	@FindBy(xpath="//input[@id='pin']") private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']") private WebElement CNT;
	
	public KiteLoginpage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void pin() {
		PIN.sendKeys("281255");
	}
	public void Continue() {
		CNT.click();
	}


}
