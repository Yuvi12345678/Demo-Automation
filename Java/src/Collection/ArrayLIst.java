package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayLIst {
	
	public static void main(String[] args) {
	   ArrayList al = new ArrayList();
	    al.add("Yuvraj");
	    al.add(100);
	    al.add(true);
	    al.add(null);
	    al.add(100);
	    al.add(null);
	    al.add(58.47f);
	    al.add('A');
	    
	    
	    // All
	    al.add(al);
	    System.out.println(al);//[Yuvraj, 100, true, null, 100, null, 58.47, A, (this Collection)]

	    al.set(3, "King");
	    System.out.println(al.get(3));
	    
	    System.out.println(al.size());//9
	    
	    System.out.println(al.contains("Yuvraj"));//true
	    
	    //remove - by index
	    al.remove(4);
	    System.out.println(al);
	    
	    //insert inf in between array list
	    al.add("pune");
	    System.out.println(al.get(1));
	    System.out.println(al.get(2));
	    System.out.println(al);
	    
	    //delete info from arraylist
	    al.remove(3);
	    System.out.println(al.get(3));
	
	    System.out.println("---Print all the information i array list using listiterator");
	     ListIterator litr = al.listIterator();
	     while(litr.hasNext()) {
	    	 System.out.println(litr.next());
	     }
	     System.out.println("----Print all the information in array list using for loop------");
	     for(int i=0; i<=al.size()-1; i++) {
	    	 System.out.println(al.get(i));
	     }
	     System.out.println("---Print all the informationin array list using for each loop---");
	     for(Object s1:al) {
	    	 System.out.println(s1);
	     }
	     
	     
	     
	


		
	}
	
	
	

}
