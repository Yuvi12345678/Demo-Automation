package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pooja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("2");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("//input[@type='submit']")).click();
		Thread.sleep(1000);
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());//used to get popups text
		
		alt.accept();//used to click on ok button
		
		//alt.dismiss();//used to click on cancel button
		
		Alert alt1 = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		alt.accept();
		
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
