package DDF_POM_TESTING_BASE_UTILITY_CLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogOutPage {
	
	@FindBy(xpath="//span[@class='icon icon-exit']") private WebElement LOGOUT;
	
	public KiteLogOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void logout() {
		LOGOUT.click();
	}

}
