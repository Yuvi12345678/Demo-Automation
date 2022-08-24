package Arrays;

public class example2 {
	public static void main(String[] args) {
		
		//int arr[] = new int[not fixed];  //data type is not fixed
			
			int arr[] = {10,20,30,40,50,60,70,80}; //declaration + initialization
			
		
			System.out.println("----Print array info in original order-----");
			for(int i=0; i<=arr.length-1; i++) {
				System.out.println(arr[i]);
				
				
				
			System.out.println("----print array info in reverse order----");
			for(int I=arr.length-1; I>=0;  I--) {
				System.out.println(arr[I]);
			}
				
			}
	}
	


}
