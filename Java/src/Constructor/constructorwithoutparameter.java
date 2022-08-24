package Constructor;

public class constructorwithoutparameter {
	
	public static void main(String[] args) {
		
		constructorwithoutparameter cp = new constructorwithoutparameter();
		constructorwithoutparameter cp1 = new constructorwithoutparameter(15, 17);
		
		
	}

	constructorwithoutparameter() {//zero parameterized constructor
		System.out.println("Quantum Acadamy");
		
	}
	constructorwithoutparameter(int a, int b) {
		System.out.println("square of 15: "+(a*a));
		System.out.println("square of 17: "+(b*b));
	}
}
