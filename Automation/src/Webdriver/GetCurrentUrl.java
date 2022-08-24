package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	
	public static void main(String[] args) {
		
		String expUrl="http://www.amazon.in";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		
		
		driver.manage().window().maximize();
		
		String actUrl = driver.getCurrentUrl();
		System.out.println(actUrl);
		
		if(expUrl.equals(actUrl)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
			
		
	}

}
