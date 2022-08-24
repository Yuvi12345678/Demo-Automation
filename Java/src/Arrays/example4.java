package Arrays;

public class example4 {
	public static void main(String[] args) {
		
		int arr[][] = {{10,20,30},{40,50,60}};
		System.out.println(arr.length); //no of rows
		
		for(int i=0; i<=arr.length-1; i++) {//row
		for(int j=0; j<=2; j++) {//column		
			System.out.print(arr[i][j]+" ");//row
			//System.out.println(arr[i][j]+" ");//column
		}
	}
	}
}
