package This_SuperKeyword;

public class This_Keyword {
	
	int a = 50; //Global variable
	
	
	public void test() {
		int a = 70; //local variable
		System.out.println(a);
		System.out.println(this.a);
		
		
	}
	public static void main(String[] args) {
		This_Keyword tk = new This_Keyword();
		tk.test();
	}
	

}
