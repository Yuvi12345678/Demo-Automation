package PageObjectModule_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github_Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(2000);
		
		GitHub_SignIn signin = new GitHub_SignIn(driver);
		signin.email();
		Thread.sleep(2000);
		
		Github_Login login = new Github_Login(driver);
		login.setGithubLoginUsername();
		login.setGithubLoginPassword();
		login.setGithubSignIn();
		Thread.sleep(2000);
		
		Github_HomePage home = new Github_HomePage(driver);
		home.button();
		Thread.sleep(2000);
		
		home.button();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
