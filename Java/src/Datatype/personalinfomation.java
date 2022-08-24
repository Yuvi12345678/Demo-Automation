package Datatype;

public class personalinfomation {
	
public static void main(String[] args) {
		
		//declaration
		String name;
		int age;
		String contactno;
		String bdate;
		float percentage;
		
		
		//initialization 
		name = "yuvraj shinde";
		age = 28;
		bdate = "19/12/1993";
		percentage = 70.75f;
		contactno = "1234567890";
		
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(bdate);
		System.out.println(contactno);
		System.out.println(percentage);
		
		
		System.out.println(name+"  "+age+"  "+ bdate+"  "+percentage);
		
		CallingStaticMethodFromSameClassaddition();
		
		
	}

private static void CallingStaticMethodFromSameClassaddition() {
	// TODO Auto-generated method stub

}
}