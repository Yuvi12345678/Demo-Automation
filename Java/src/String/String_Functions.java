package String;

public class String_Functions {
	
	public static void main(String[] args) {
		
		String s1 = "QUANTUM";
		String s2 = "quantum";
		String s3 = "";
		String s4 = "Quantum Acadamy";
		String s5 = "Quantum";
		
		
		
		//1. equals
		if(s1.equals(s2)) {
			System.out.println("Both the strings are equal");
		
		}else {
			System.out.println("Both the strings are not equal");
		}
		//2. equal ignore case
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Both strings are equal");
			
		} else {
			System.out.println("Both strings are not equal");
			
		}
		//3. To lower case
		System.out.println(s2.toLowerCase()); //quantum
	
	
	    //4. to upper case
	    System.out.println(s2.toUpperCase()); //QUANTUM
	    
	    //5. is empty
	    System.out.println(s3.isEmpty());//true
	    
	    //6. ends with
	    System.out.println(s4.endsWith("Y")); //false
	    
	    //7.Start with
	    System.out.println(s4.startsWith("Q"));//true
	    
	    //8. Contains
	    System.out.println(s4.contains(s5));//true
	    
	    //9. concat
	    System.out.println(s1.concat(s2));//QUANTUMquantum
	    
	    //10. length 
	    System.out.println(s4.length());//no of character including space
	    
	    //11. charAt
	    System.out.println(s5.charAt(4));
	    
	    //12.replace
	    System.out.println(s4.replace("u", "b"));//char
	    System.out.println(s4.replaceAll(s4, s5));//string
	    System.out.println(s4.replaceFirst("u", "h"));
	    
	    //13.substring
	    System.out.println(s5.substring(0));
	    System.out.println(s4.substring(0, 7));
	    
	    //14. lastIndexof
	    System.out.println(s2.lastIndexOf("u"));
	    System.out.println(s2.lastIndexOf("t"));
	    
	    
	}	 
	
	
	
}

