package JavaLogicalProgram;

public class Count_Whitespaces {
	public static void main(String[] args) {
		String str = "My name is yuvraj shinde";
		
		int count =0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch==' ') 
				count++;
			}
			System.out.println("whitespace count: "+count);
		}
		
	
}
