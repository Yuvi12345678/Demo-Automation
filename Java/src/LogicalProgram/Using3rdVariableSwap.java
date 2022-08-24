package LogicalProgram;

public class Using3rdVariableSwap {
public static void main(String[] args) {
		
		int a= 10;
		int b=20;
		
		int temp = a;//10
		a=b;//a=20;
		b=temp;//10
		
		System.out.println("a:"+a+"b:"+b);
	}

}
