package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Verification_SoftAssert {
	
	@Test
	public void test() {
		String expresult = "Quantum Acadamy";
		String actresult = "quantum";
		boolean result = false;
		
		SoftAssert soft = new SoftAssert();
		
		Assert.assertEquals(actresult, expresult, "act and exp result is different");
		
		Assert.assertNotEquals(actresult, expresult, "act and exp result are same");
		
		Assert.assertTrue(result, "result is false");
		
		soft.assertAll();
		
		//In soft assert we will get all the verification result
	}

}
