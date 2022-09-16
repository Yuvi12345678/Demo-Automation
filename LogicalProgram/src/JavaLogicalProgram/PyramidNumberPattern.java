package JavaLogicalProgram;

public class PyramidNumberPattern {
	public static void main(String[] args) {
		for(int i=1; i<5; i++) {
			for(int j=1; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int b=1; b<i; b++) {
				System.out.print(" "+b);
			}
			System.out.println();
		}
	}

}
