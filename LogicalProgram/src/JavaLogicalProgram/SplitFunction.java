package JavaLogicalProgram;

public class SplitFunction {
	public static void main(String[] args) {
		String str = "my name is yuvraj";
		
		
		String[] arr = str.split(" ");
		String rev ="";
		
		for(String a:arr) {
			for(int i=a.length()-1; i>=0; i--) {
				rev = rev+a.charAt(i);
			}
			rev = rev+" ";
		}
		
		System.out.println(rev);
		
	}


}
