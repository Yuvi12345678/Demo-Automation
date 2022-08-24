package This_SuperKeyword;

public class SuperKeyword extends example1 {
	
	int x = 20;
	
	public void test() {
		int x = 60;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		System.out.println(a);
		
		
	}
	public static void main(String[] args) {
		SuperKeyword sk = new SuperKeyword();
		sk.test();
	}

}
