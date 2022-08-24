package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	
	public static void main(String[] args) {
		String expTitle ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More-Amazon.in";
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Pooja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://amazon.in/");
		
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		
		if(expTitle.equals(actTitle)) {
			System.out.println("Pass");
			
		}else {
			System.out.println("Fail");
		}
	}

}
