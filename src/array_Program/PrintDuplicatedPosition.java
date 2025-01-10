package array_Program;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintDuplicatedPosition {
	public static void main(String[] args) {
		int[] a= {1,2,3,1,2,3,3,4};
		LinkedHashMap<Integer, ArrayList<Integer>> map = new LinkedHashMap<Integer, ArrayList<Integer>>();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.get(a[i]).add(i);
			}else {
				map.put(a[i], new ArrayList<Integer>());
			}
			
		}
		for(Entry<Integer, ArrayList<Integer>> ref:map.entrySet()) {
			if(ref.getValue().size()>0) {
				System.out.println(ref.getKey()+"-"+ref.getValue()+" ");
			}
			
		}
	}

}
