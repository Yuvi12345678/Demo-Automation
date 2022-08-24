package methods;

public class CallingStaticMethodFromSameClass {

	
	public static void main(String[] args) { 
		addition();
		substraction();
		multiplication();
		division();

		
	}
	public static void addition() {
		int a = 30;
		int b = 50;
				System.out.println("Addition is "+(a+b));
	}
	public static void multiplication() {
	
        int a = 30;
        int b = 50;
        System.out.println("multiplication is "+(a*b));
	}    
     public static void substraction() {
		
		int a = 30;
		int b = 50;
		System.out.println("substraction is "+(a-b));
	}	
	public static void division() {
		
		int a = 30;
		int b = 50;
		System.out.println("division is "+(a/b));

		
}
}
	
	
	

