package LogicalProgram;

public class find_factorial_of_a_given_no {
	
	public static void main(String[] args) {
		
		int num = 4; 
		int fact = 1;
		
		for(int i= num; i>=1; i--) {
			fact = fact * i;//4*1=4*3=12*2=24*1=24
			System.out.println(fact);
			
		}
	}

}
