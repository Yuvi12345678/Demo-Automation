package PracticeCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ARRAYLIST {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("Yuvraj Shinde");
		al.add(100);
		al.add(null);
		al.add(200);
		al.add(null);
		al.add("Quantum Acadamy");
		al.add('A');
		al.add(45.98f);
		
		System.out.println(al);//[Yuvraj Shinde, 100, null, 200, null, Quantum Acadamy, A]
		System.out.println(al.add("Pune"));// insert info in between array list -> right shift operation
		
		al.set(3, "Pune");
		System.out.println(al.get(3));//pune
		
		System.out.println(al);//[Yuvraj Shinde, 100, null, Pune, null, Quantum Acadamy, A, 45.98, Pune]
		System.out.println(al.size());//9
		System.out.println(al.isEmpty());//false
		System.out.println(al.contains("Yuvraj Shinde"));//true
		
		al.remove(3);// delete info from arraylist -> left shift operation
		System.out.println(al);//[Yuvraj Shinde, 100, null, null, Quantum Acadamy, A, 45.98, Pune]
		
		
		System.out.println("----Print all the information in array list using iterator------");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
	    System.out.println("----Print all the information in array list using listiterator------");
	    ListIterator litr = al.listIterator();
	    while(litr.hasNext()) {
	    	System.out.println(litr.next());
	    	
	    System.out.println("----Print all the information in array list using for loop------");
	    for(int i=0; i<=al.size()-1; i++) {
	    	System.out.println(al.get(i));
	    	
	    	System.out.println("----Print all the information in array list each loop------");
	    	for(Object s1:al) {
	    		System.out.println(s1);
	    	}
	    	
	    }
	    
	    }
	    
		}
		
		
		
		
		
	}

}
