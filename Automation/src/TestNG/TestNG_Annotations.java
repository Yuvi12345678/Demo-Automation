package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotations {

	@BeforeClass
	public void openBrowser() {
	}
	@BeforeMethod
	public void login() {
	}
	@Test
	public void Username() {
	}
	@Test
	public void Password() {
	}
	@AfterMethod
	public void logout() {
	}
	@AfterClass
	public void closeBrowser() {
	}
}
