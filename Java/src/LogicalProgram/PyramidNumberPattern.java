package LogicalProgram;

public class PyramidNumberPattern {
	public static void main(String[] args) {
		for(int i=1; i<6; i++) {
			for(int j=1; j<6-i; j++) {
				System.out.print(" ");
			}
			for(int b=1; b<i; b++) {
				System.out.print(" "+b);
			}
			System.out.println();
		}
	}

}
