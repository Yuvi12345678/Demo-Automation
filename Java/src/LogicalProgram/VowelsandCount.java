package LogicalProgram;

public class VowelsandCount {
	public static void main(String[] args) {
		String str ="yuvraj";
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a'|| str.charAt(i) =='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u') {
				count++;
				System.out.println("vowel contains"+str.charAt(i));
				
				}
			System.out.println("number of vowels"+count);
		}
	}

}
