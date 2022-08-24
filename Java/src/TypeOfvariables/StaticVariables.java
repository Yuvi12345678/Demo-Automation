package TypeOfvariables;

public class StaticVariables {
	
	static int a = 20;
	
	public static void m1() {
		System.out.println(a);
	}
	public void m2() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		StaticVariables sv = new StaticVariables();
		m1();
		sv.m2();
		
	}
}
