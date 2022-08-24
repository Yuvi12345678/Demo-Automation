package HandlingOfDyanamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicElement2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Apple mobiles");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(1000);
		
		String text = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[1]//span)[4]")).getText();
		System.out.println(text);//89,173
		
		Thread.sleep(1000);
		driver.quit();
	}

}
