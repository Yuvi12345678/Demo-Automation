package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfClear {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		 WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		 
		 driver.findElement(By.xpath("//input[@name='lastname']")).clear();
		 
		 Thread.sleep(2000);
		 
		 lastname.clear();
		 
		 driver.quit();
		
		
	}

}
