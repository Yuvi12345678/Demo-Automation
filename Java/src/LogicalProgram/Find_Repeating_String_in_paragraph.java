package LogicalProgram;

import java.util.HashMap;
import java.util.Set;

public class Find_Repeating_String_in_paragraph {
	
	public static void main(String[] args) {
		String str="abc abcd abc abcd xyz abc abc abc xyz xyz xyz";
		
		String ar[]=str.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<=ar.length-1; i++) {
			String s1 = ar[i];
			
		if(map.containsKey(s1)) {
			map.put(s1, map.get(s1)+1);
		}else {
			map.put(s1, 1);
		}
		System.out.println(map);
		}
		Set<String> str2 = map.keySet();
		for(String st:str2) {
			System.out.println(st+":"+map.get(st));
		}
	}

}
