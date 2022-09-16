package JavaLogicalProgram;

import java.util.Arrays;

public class ArrayToString {
	
		public static void main(String[] args) {
			String[] s = new String[3];
			
			s[0]="i";
			s[1]="am";
			s[2]="Yuvraj";
			
			String s1 = Arrays.toString(s);
			
			for(int i=0; i<s1.length()-1; i++) {
				System.out.print(s1.charAt(i));
			}
		}

	

}
