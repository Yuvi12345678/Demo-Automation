package LogicalProgram;

public class Remove_Whitepaces {

	public static void main(String[] args) {
		String str = "ab  cd efg ij";
		
		str=str.strip().replace(" ", "");
		
		System.out.println(str);
	}
}
