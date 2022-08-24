package Arrays;

public class example3 {
	public static void main(String[] args) {
		
		int arr[][] = new int[2][2]; //row & columns
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		
		System.out.println(arr[0][1]); //20
		
		for(int i=0; i<=1; i++) {
		for(int j=0; j<=1; j++) {
			System.out.println(arr[i][j]+" "); //column
			//System.out.print(arr[i][j]+" "); //row
		}
			
		}
	}

}
