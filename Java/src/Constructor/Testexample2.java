package Constructor;

public class Testexample2 {
	
	public static void main(String[] args) {
		
	example2 ex2 = new example2();
	ex2.multiplication();//0
	example2 ex3 = new example2(20,30);
	ex3.multiplication();//0
	example2 ex4 = new example2(10,20,30);
	ex4.multiplication();//6000
	
	}

}
