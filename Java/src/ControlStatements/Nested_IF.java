package ControlStatements;

public class Nested_IF {
	
	public static void main(String[] args) {
		
	String username = "Quantum";
	String Password = "qa@123";
	
	if(username=="Quantum") {
		System.out.println("Correct Username");
		
	}if(Password=="qa@123") {
		System.out.println("Correct Passqword");
		System.out.println("Login Successfully");
		
	}else {
		System.out.println("Wrong Password");
		System.out.println("Login Faild");
	
	}  {
		System.out.println("Wrong Usernamer");
		System.out.println("Login Failed");
	}	
	
	}

}
