 package methods;

public class CallingNonStaticMethodFromSameClass {
	
	public static void main(String[] args) {
	// how to create object of class:
	//Class name - object name = new class name(); -> creation of object
	//object_name.method_namez(); -> Calling non static method
		
	//new -> used to create blank object in memory 
		
		CallingNonStaticMethodFromSameClass obj1 = new CallingNonStaticMethodFromSameClass();
		obj1.addition();
		obj1.substraction();
		obj1.division();
		obj1.multiplication();
	}

	public void addition() {
	int a = 80;
	int b = 90;
	System.out.println("addition: "+(a+b));
	}
	public void substraction() {
	int a = 70;
	int b = 80;
	System.out.println("substraction: "+(a-b));
	}
	public void division() {
	int a = 50;
	int b = 100;
	System.out.println("division: "+(a/b));
	}
	public void multiplication() {
	int a = 40;
	int b = 60;
	System.out.println("multiplication: "+(a*b));
	
	}
}
