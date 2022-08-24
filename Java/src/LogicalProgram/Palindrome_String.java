package LogicalProgram;

public class Palindrome_String {
	
	public static void main(String[] args) {
		String org="madam";
		String rev="";
		
		for(int i=org.length()-1; i>=0; i--) {
			rev=rev+org.charAt(i);
		}
		if(org.endsWith(rev)) {
			System.out.println("String is palindrome");
		}else{
			System.out.println("String is not palindrome");
		}
	}

}
