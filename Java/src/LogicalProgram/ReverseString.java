package LogicalProgram;

public class ReverseString {
	
	public static void main(String[] args) {
		String str ="yuvraj,vidya,swapnali,vilas,jayshree";
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		String str1[] = new String[5];
		str1[0]="Yuvraj";
		str1[1]="Vidya";
		str1[2]="Swapnali";
		str1[3]="Vilas";
		
		for(int i=str1.length-1; i>=0; i--) {
			System.out.println(str1[i]);
		
		}
 	}

}
