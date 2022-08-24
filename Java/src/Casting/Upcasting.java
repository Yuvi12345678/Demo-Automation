
package Casting;

public class Upcasting {
	
	public static void main(String[] args) {
		
		father s = new son();  //create an object for subclass and provide reference of super class
		s.house();
		
		
		
		//down casting
		son s1 = (son)s;
		s1.house();
		s1.bunglow();
		
		
	}

}
