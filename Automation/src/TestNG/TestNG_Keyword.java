package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keyword {
	
	@Test (invocationCount = 2)
	public void TC1() {
	Reporter.log("Running TC1", true);
	}
	@Test
	public void TC2() {
	Reporter.log("Running TC2", true);
	}
	@Test(priority=1)
	public void TC3() {
	Reporter.log("Running TC3", true);
	}
	@Test(priority=-1)
	public void TC4() {
	Reporter.log("Running TC4", true);
	}
	@Test(timeOut=4000)
	public void TC5() throws InterruptedException {
		Thread.sleep(5000);
		Reporter.log("running TC5", true);
	}

}
