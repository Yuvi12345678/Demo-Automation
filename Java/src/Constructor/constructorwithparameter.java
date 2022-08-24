package Constructor;

public class constructorwithparameter {
	
	public static void main(String[] args) {
		
		constructorwithparameter cp1 = new constructorwithparameter();//without parameter
		constructorwithparameter cp2 = new constructorwithparameter(10,20);
		constructorwithparameter cp4 = new constructorwithparameter("Quantum Acadamy");
		cp1.division(20,5);//4
		cp2.division(40,10);//4
		
		
	}
	constructorwithparameter() {//without parameter
		System.out.println("good morning");
		
	}
	constructorwithparameter(int a, int b) {
		System.out.println("adition: "+(a+b));
		
	}
	constructorwithparameter(String name) {
		System.out.println("name is:"+name);
		
	}
	public void division(int a, int b) {
		System.out.println("division:"+(a/b));

		
		
	}

}
