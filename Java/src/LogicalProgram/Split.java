package LogicalProgram;

public class Split {
	public static void main(String[] args) {
		String str = "sachin,sehwag,virat";
		String[] arrsplit = str.split(",");
		
		for(int i=0; i<arrsplit.length; i++) {
			System.out.println(arrsplit[i]);
		}
	}

}
