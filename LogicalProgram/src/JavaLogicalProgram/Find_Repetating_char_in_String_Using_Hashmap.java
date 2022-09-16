package JavaLogicalProgram;

import java.util.HashMap;

public class Find_Repetating_char_in_String_Using_Hashmap {
	public static void main(String[] args) {
		String str ="abdadcdscsadcgdcadcad";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<str.length()-1; i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
				}else {
					map.put(ch, 1);
					
					
			System.out.println(map);
				}
		}
	}

}
