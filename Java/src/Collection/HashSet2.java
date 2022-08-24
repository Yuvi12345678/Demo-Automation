package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet2 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("Yuvraj");
		al.add(100);
		al.add(true);
		al.add('a');
		al.add(100);
		al.add('a');
		al.add(56.94f);
		al.add("Yuvraj");
		
		System.out.println(al);
		
		HashSet hs = new HashSet(al);
		System.out.println(hs);
		
		LinkedHashSet lhs = new LinkedHashSet(al);
		System.out.println(lhs);
		
		//TreeSet ts = new TreeSet(al);
		//System.out.println(ts);//classcastexception
		
	}

}
