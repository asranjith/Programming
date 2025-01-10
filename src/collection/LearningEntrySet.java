package collection;

import java.util.Map.*;
import java.util.HashMap;

public class LearningEntrySet {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(621216, "Trichy");
		map.put(52436, "kumbakonam");
		map.put(53627, "Tirupati");
		
		for(Entry<Integer,String>ref:map.entrySet()) {
			System.out.println(ref.getKey()+" "+ref.getValue());
		}
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map.containsKey(908879));
		System.out.println(map.containsValue("kumbakonam"));
		
		map.replace(53627, "bengaluru");
		System.out.println(map);
		map.replace(53627, "Tirupati");
		System.out.println(map);
		
		map.remove(53627);
		System.out.println(map);
		map.remove(52436,"kumbakonam");
		System.out.println(map);
		
	}

}
