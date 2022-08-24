package LogicalProgram;

public class PyriamidStarPattern {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int b=0; b<=i; b++) {
				System.out.print(" "+"*");
			}
			System.out.println();
		}
	}

}
