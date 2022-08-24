package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

  public class TestNG_Test_Class {
	
	@Test
	public void test() {
		//System.out.println("Quantum Acadamy");
		//Reporter.log("Quantum Acadamy", false);
		Reporter.log("Quantum Acadamy", true);
	}

}
