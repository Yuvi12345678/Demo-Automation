package JavaLogicalProgram;

public class PalindromeString {
	public static void main(String[] args) {
		String org="madam";
		String rev="";
		
		for(int i=org.length()-1; i>=0; i--) {
			rev=rev+org.charAt(i);
		}
			if(org.endsWith(rev)) {
				System.out.println("Palindrome String");
			}else {
				System.out.println("Palindrome is not String");
			}
		
	}

}
