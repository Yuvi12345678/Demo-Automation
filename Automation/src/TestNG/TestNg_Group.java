package TestNG;

import org.testng.annotations.Test;

public class TestNg_Group {
	
	@Test(groups="facebook")
	public void TC1() {
		System.out.println("Running TC1");
	}
	@Test(groups="facebook")
	public void TC2() {
		System.out.println("Running TC2");
	}
	@Test(groups="facebook")
	public void TC3() {
		System.out.println("Running TC3");
	}
	@Test(groups="WhatsApp")
	public void TC4() {
		System.out.println("Running TC4");
	}
	@Test(groups="WhatsApp")
	public void TC5() {
		System.out.println("Running TC5");
	}
	@Test(groups="WhatsApp")
	public void TC6() {
		System.out.println("Running TC6");
	}
	@Test(groups="Gmail")
	public void TC7() {
		System.out.println("Running TC7");
	}
	@Test(groups="Gmail")
	public void TC8() {
		System.out.println("Running TC8");
	}
	@Test(groups="Gmail")
	public void TC9() {
		System.out.println("Running TC9");
	}

}
