package LogicalProgram;

public class SwapWithout3rdVariable {
	public static void main(String[] args) {
		System.out.println("write the program to swap 2 no without 3rd variable");
		
		int a = 150;
		int b = 100;
		
		a= a+b;//150+100=250
		b= a-b;//250-100=100
		a= a-b;//250-100=150
		
		System.out.println("a:"+a+"b:"+b);
	}

}
