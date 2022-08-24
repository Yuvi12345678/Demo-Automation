package LogicalProgram;

import java.util.HashMap;
import java.util.Set;

public class Find_repeating_char_in_String_using_hashmap {
	public static void main(String[] args) {
		String str="abcdabcdaeeabc";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length()-1; i++) {
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
			System.out.println(map);
		}
			
	}

}
