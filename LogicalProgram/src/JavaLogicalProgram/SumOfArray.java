package JavaLogicalProgram;

public class SumOfArray {
public static void main(String[] args) {
		
		int ar[]= {10,20,30,40,50};
		int sum=0;
		
		for(int i=0; i<=ar.length-1; i++) {
		 sum=sum+ar[i];
		}
		System.out.println(sum);//150
	}

}
