package Constructor;

public class defaultconstructor {
	
	int a;//0 it will take default value
	String name;//null
	float marks;//0.0

public static void main(String[] args) {
	
	defaultconstructor dc = new defaultconstructor();//class name object = new class name
	dc.addition();
 }
public void addition() {
	int a =80;
	int b = 90;
	System.out.println("addition: "+(a+b));
	
}
}

