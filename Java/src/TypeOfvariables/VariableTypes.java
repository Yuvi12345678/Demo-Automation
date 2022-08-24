package TypeOfvariables;

public class VariableTypes {
	
	//Type of variables
	//1.Local variables
	//2.Global variables
	//3.Class/Static variables
	//4.instance/non static variables
	
	
	int b = 20; //Global variable
	
	public void test() {
		int a = 50;//local variable
		System.out.println(a);
		System.out.println(b);
		
	
	}
	public static void main(String[] args) {
		VariableTypes vt = new VariableTypes();
		vt.test();
	}

}
