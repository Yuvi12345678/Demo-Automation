package CustomizedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("((//a[@class='button button-orange'])[4]"));
		WebElement dest= driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']/li"));
		Actions act = new Actions(driver);
		//act.dragAndDrop(src, dest).perform();
		act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
