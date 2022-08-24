package TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Assertions {
	
	/*@Test
	public void test() {
		Reporter.log("running test method", true);
		String expResult = "Qunatum Acadamy";
		String actResult = "Quantum";
		
		Assert.assertEquals(actResult, expResult, "act and exp results are not equal");
	}*/
	/*@Test
	public void test() {
		Reporter.log("running test method", true);
		String expResult = "Qunatum Acadamy";
		String actResult = "Quantum";
		
		Assert.assertNotEquals(actResult, expResult, "act and exp results are same");
	}*/
	/*@Test
	public void test() {
		boolean result = true;
		Assert.assertTrue(result, "result is false");
	}*/
	
	/*@Test
	public void test() {
		boolean result = true;
		Assert.assertFalse(result, "result is true");
	}*/
	/*@Test
	public void test() {
		String result = null;
		Assert.assertNull(result, "result is not null");
	}*/
	/*@Test
	public void test() {
		String result = "Qunantum";
		Assert.assertNotNull(result, "result is null");
	}*/
	@Test
	public void test() {
		Reporter.log("running test method", true);
		Assert.fail();
	}
}
 