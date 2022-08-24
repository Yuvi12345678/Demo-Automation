package PracticeCollection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VECTOR {
	public static void main(String[] args) {
		
		Vector vc = new Vector();
		
		vc.add("Pune");
		vc.add(100);
		vc.add(null);
		vc.add(200);
		vc.add(83.89f);
		vc.add('A');
		vc.add("Quantum Acadamy");
		
		System.out.println(vc);//[Pune, 100, null, 200, 83.89, A, Quantum Acadamy]
		System.out.println(vc.isEmpty());//false
		System.out.println(vc.capacity());//10
		
		vc.set(4, 'A');
		System.out.println(vc.get(4));//A
		System.out.println(vc);//[Pune, 100, null, 200, A, A, Quantum Acadamy]
		
		vc.add("Mumbai");
		System.out.println(vc);//[Pune, 100, null, 200, A, A, Quantum Acadamy, Mumbai]
		
		System.out.println(vc.size());//8
		
		//Iterator
		Iterator itr = vc.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
		//listiterator
		ListIterator litr = vc.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
			
			
		// for loop
		for (int i=0; i<=vc.size()-1; i++) {
			System.out.println(vc.get(i));
			
		//each loop
		for(Object is:vc) {
			System.out.println(is);
		}
		}
		}
				
		
		}
		}

}
