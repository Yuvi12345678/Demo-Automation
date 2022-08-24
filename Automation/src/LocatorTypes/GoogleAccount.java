package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAccount {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf'][1]")).sendKeys("yuvraj");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Shinde");
		driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("yuvrajshinde");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Yuvi@123");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Yuvi@123");
		driver.findElement(By.xpath("//body[@id='yDmH0d']")).click();		
	}

}
