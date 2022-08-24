package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Pooja/Downloads/HTML/Locator.html");
		
		//1.tagname
		driver.findElement(By.tagName("input")).sendKeys("qa@pune.com");
		
		//2.id
		driver.findElement(By.id("abc")).sendKeys("Yuvi@123");
		
		//3.classname
		driver.findElement(By.id("abcd")).sendKeys("shindey340@gmail.com");
		
		//4.name
		driver.findElement(By.id("123")).sendKeys("9309102864");
		
		//5.linkText
		driver.findElement(By.linkText("Link1")).click();
		
		//6.partialLinkText
		driver.findElement(By.partialLinkText("Li")).click();
		
		//7.CssSelector
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();//signup
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
