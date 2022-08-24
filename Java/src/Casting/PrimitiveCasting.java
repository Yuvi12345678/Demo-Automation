package Casting;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
		//1 byte -> 2 byte -> 4 byte -> 8 byte
		//byte -> short -> int -> long -> float -> double
		
		
		//1. Implicit casting - widening casting (where memory goes to increase)
		
		int a =5; //4 byte
		double b = a; //8 byte
		System.out.println(b);
		
		
		//2. Explicit casting - narrowing casting ( where memory size goes on decreasing )
		
		double d1 = 5.0;   //8 byte
		int a1 = (int) d1;
		float f1 = (float) d1;
		System.out.println(a1);
		System.out.println(f1);
		
		
		long i = 325464675756l;
		System.out.println(i);
		
	}

}
