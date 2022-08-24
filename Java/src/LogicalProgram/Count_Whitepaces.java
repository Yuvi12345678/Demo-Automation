package LogicalProgram;

public class Count_Whitepaces {
	public static void main(String[] args) {
		String str="ab  cd  ef";
		
		int count=0; 
		for(int i=0; i<=str.length()-1; i++) {
			char ch = str.charAt(i);
			
		if(ch==' ') {
			count++;
		}
		System.out.println("No of whitespaces in String: "+count);
		}
	}

}
