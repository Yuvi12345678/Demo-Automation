package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement=&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D9062116%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwwo-WBhAMEiwAV4dybcswmOvWpOFeo0w3EfPHxxtZajdTrrVA4c7yzwakYAaxpkuSI67tuRoCiZkQAvD_BwE");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("yuvraj");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Shinde");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("shindey340@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("shindey340@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("9309102864");
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("19");
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("dec");
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1993");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//label[text()='Custom']")).click();
		driver.findElement(By.xpath("//select[@name='preferred_pronoun']")).click();
		driver.findElement(By.xpath("//input[@name='custom_gender']")).sendKeys("Male");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		driver.quit();
		
		
		
		}

}
