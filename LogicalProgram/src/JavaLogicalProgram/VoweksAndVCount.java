package JavaLogicalProgram;

public class VoweksAndVCount {
	public static void main(String[] args) {
		String str = "Yuvraj";
		
		int count=0;
		for(int i=0; i<=str.length()-1; i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
				System.out.println("vowels contain"+str.charAt(i));
				System.out.println("count"+count);
			}
			
		}
	}

}
