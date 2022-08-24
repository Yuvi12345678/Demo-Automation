package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserGetFunciton {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Pooja\\\\Downloads\\\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting
		
		driver.get("http://amazon.in/");
		
		driver.manage().window().maximize();
		
		
		//driver.close();
		
		
	}

}
