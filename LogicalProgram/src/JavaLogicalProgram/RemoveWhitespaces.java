package JavaLogicalProgram;

public class RemoveWhitespaces {
	public static void main(String[] args) {
		String str = "abd adna   dnd  dnd   dne";
		
		str=str.strip().replace(" ","");
		System.out.println(str);
	}

}
