package collection;

import java.util.HashMap;

public class LearningHashMap {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(621216, "Trichy");
		map.put(52436, "kumbakonam");
		map.put(53627, "Tirupati");
			
		System.out.println(map);
		
		HashMap map1=new HashMap();
		map1.put(621215, "Trichy");
		map1.put(52435, "kumbakonam");
		map1.put(53625, "Tirupati");
		map.putAll(map1);
		System.out.println(map);
	}

}
