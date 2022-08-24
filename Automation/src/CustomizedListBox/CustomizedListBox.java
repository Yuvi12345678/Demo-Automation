package CustomizedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomizedListBox {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D9062116%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwwo-WBhAMEiwAV4dybcswmOvWpOFeo0w3EfPHxxtZajdTrrVA4c7yzwakYAaxpkuSI67tuRoCiZkQAvD_BwE");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Create a new account']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Actions act = new Actions(driver);//Keyboard can interact with browser with the help of actions class
		
		//1. click-used to click on WebElement
		act.click(month).perform();
		
		//2.Perform - to execute every actions/method of Actions class we need to use perform()method
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
