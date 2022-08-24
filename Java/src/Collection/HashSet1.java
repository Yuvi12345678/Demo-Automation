package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add('A');
		hs.add("Quantum Acadamy");
		hs.add(700);
		hs.add('A');
		hs.add(null);
		hs.add(true);
		hs.add(null);
		
		
		System.out.println(hs);
		System.out.println(hs.contains(true));//true
		System.out.println(hs.isEmpty());//false
		
		hs.remove(700);
		System.out.println(hs);
		
		//hs.clear();
		//System.out.println(hs);//[]
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		for(Object h1:hs) {
			System.out.println(h1);
		}
		}
		
		
		
				
	}
	

}
