package Collection;

import java.util.LinkedList;

public class _LInkedList {
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add("Jai Hind");
		ll.add('A');
		ll.add(100);
		ll.add(null);
		ll.add(200);
		ll.add(null);
		
		System.out.println(ll);//[Jai Hind, A, 100, null, 200, null]
		System.out.println(ll.contains('A'));//True
		System.out.println(ll.isEmpty());//False
		System.out.println(ll.get(3));//null
		
		//replace
		ll.set(3, "Jai Hind");
		System.out.println(ll.get(3));
		
		System.out.println("---Print all information using for loop-----");
		for(int i=0; i<=ll.size()-1; i++) {
			System.out.println(ll.get(i));
			
		System.out.println("---Print all information using for each loop-----");	
		for(Object lli:ll);
		System.out.println(ll);
		}
			
		}
		}
		
	
	


