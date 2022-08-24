package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetSizeofList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement=&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D9062116%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwwo-WBhAMEiwAV4dybbHZN0bp1oJ86KxTaqP_EdFMO8EiukEGyd4-nKl3vFx65wDcnAPGaxoC7k8QAvD_BwE");
		driver.manage().window().maximize();
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s = new Select(month);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println("Size of month list box:"+size);//12
		
		System.out.println("Print all of the option list box using for each loop");
		for(WebElement option:options) {
			System.out.println(option.getText());
			
		System.out.println("Print all of the option of listbox using for loop");
		for(int i=0; i<=size-1; i++) {
			System.out.println(options.get(i).getText());
		}
		}
		
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
