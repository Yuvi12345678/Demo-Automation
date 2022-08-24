package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TREESET {
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		ts.add(98);
		ts.add(67);
		ts.add(47);
		ts.add(34);
		ts.add(47);
		ts.add(98);
		ts.add(34);
		
		System.out.println(ts);//[34, 47, 67, 98]
		System.out.println(ts.contains(47));//true
		System.out.println(ts.isEmpty());//false
		System.out.println(ts.size());//4
		
		ts.remove(34);
		System.out.println(ts);//[47, 67, 98]
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		
		for(Object ts1:ts) {
			System.out.println(ts1);
			
		System.out.println("Print all the information in desending order");
		Iterator disr = ts.descendingIterator();
		while(disr.hasNext()) {
			System.out.println(disr.next());
		}
		
		}
		
		
		
	}

}
