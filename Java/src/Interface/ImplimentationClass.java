package Interface;

public class ImplimentationClass implements Interface1,Interface2{
	
	public void m1() {
		System.out.println("running m1 method");
	}
	public void m2() {
		System.out.println("running m2 method");
		
	}
	public void m3() {
		System.out.println("running m3 method");
		
	}
	public void m4() {
		System.out.println("running m4 method");
	}
	
	public static void main(String[] args) {
		ImplimentationClass Ic = new ImplimentationClass();
		Ic.m1();
		Ic.m2();
		Ic.m3();
		Ic.m4();
		
		
	}
	

}
