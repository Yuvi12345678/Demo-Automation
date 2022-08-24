package Collection;

import java.util.HashMap;

public class Hashmap {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("yuvraj", 1);
		map.put("rohan", 2);
		map.put("rohit", 3);
		map.put("mohit", 4);
		
		System.out.println(map);
		
		System.out.println(map.size());
		
		System.out.println(map.values());
		
	}

}
