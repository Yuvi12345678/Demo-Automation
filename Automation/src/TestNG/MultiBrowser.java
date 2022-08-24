package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class MultiBrowser {
	
	@Parameters("browserName")
	@Test
	public void TC1(String browserName) throws InterruptedException {
		WebDriver driver = null;
	if(browserName.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Downloads\\chromedriver_win32.chromedriver.exe");
		driver = new ChromeDriver();
	}else if(browserName.equals("ie")) {
		System.setProperty("webdriver.Ie.driver", "C:\\Program Files\\Internet Explorer.ie.exe file path");
		driver = new InternetExplorerDriver();
	}
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(2000);
	
	driver.quit();
		
	}

}
