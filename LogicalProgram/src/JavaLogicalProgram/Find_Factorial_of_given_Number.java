package JavaLogicalProgram;

public class Find_Factorial_of_given_Number {
	public static void main(String[] args) {
		int num =5;
		int fact=1;
		
		for(int i=num; i>=1; i--) {
			fact = fact * i;//5*4=20,20*3=60,60*2=120,120*1=120;
			System.out.println(fact);
		}
	}

}
