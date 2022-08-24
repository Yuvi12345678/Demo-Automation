package methods;

public class CallingNonStaticMethodFromDifferentClass {
	
	public static void main(String[] args) {
		
		CallingNonStaticMethodFromSameClass obj2 = new CallingNonStaticMethodFromSameClass();
		obj2.addition();
		obj2.substraction();
		obj2.division();
		obj2.multiplication();
	}

}
