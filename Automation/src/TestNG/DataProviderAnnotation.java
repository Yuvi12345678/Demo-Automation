package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	
	@DataProvider(name="data-provider")
	public Object[][] dataprovidermethod(){
		return new Object[][] {{"WBT"},{"BBT"},{"GBT"}};
	}
	@Test(dataProvider="data-provider")
	public void display(String value) {
		System.out.println("value is:"+value);
	}

}
