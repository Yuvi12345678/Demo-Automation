package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopups {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pooja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(1000);
		
		String IdOfMainPage = driver.getWindowHandle();
		System.out.println(IdOfMainPage);
		
		Set<String> ids = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(ids);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		Thread.sleep(1000);
		
		driver.quit();
		
		
	}

}
