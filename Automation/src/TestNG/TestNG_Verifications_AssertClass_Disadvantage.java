package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Verifications_AssertClass_Disadvantage {
	
	@Test
	public void test() {
		String expresult = "Quantum Acadamy";
		String actresult = "quantum";
		boolean result = false;
		
		Assert.assertEquals(actresult, expresult, "act and exp result is different");
		
		Assert.assertNotEquals(actresult, expresult, "act and exp result are same");
		
		Assert.assertTrue(result, "result is false");
		
		//Disadvantages: if any of assertion/verification gets failed, then remaining assertions will not get checked. 
	}

}
