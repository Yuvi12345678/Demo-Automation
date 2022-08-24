package String;

public class reversestring {
	
	public static void main(String[] args) {
		
		String str= "yuvraj,vidya,swapnali,vilas,jayshree";
	    
		
		System.out.println("---reverse order----");
		for (int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i)+" ");
		}
		String str1[] = new String[5];
		
		str1[0]="yuvraj";
		str1[1]="vidya";
		str1[2]="vilas";
		str1[3]="Swapnali";
		str1[4]="jayshree";
		
		for(int i=str1.length-1; i>=0; i--)
		System.out.println(str1[i]);
		
	}

}
