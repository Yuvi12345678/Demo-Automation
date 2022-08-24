package TypeOfvariables;

public class NonStaticVariables {
	int a = 50;//global non static variable
	
	public void test() {
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		NonStaticVariables nv = new NonStaticVariables();
		System.out.println(nv.a);
	}
		
		
	}


