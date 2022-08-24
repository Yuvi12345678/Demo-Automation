package Constructor;

public class example2 {

	//declaration
	int a;
	int b;
	int c;
	
	example2() {// initialization
		a = 100; 
		b = 200;
	
	}
	example2(int x, int y) {
		a = x;//20
		b = y;//30
	}
	example2(int x, int y, int z) {
		a = x;//10
		b = y;//20
		c = z;//30
	}
	public void multiplication() {
		System.out.println("a*b*c");
		
	}
}
