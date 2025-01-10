package string_Program;

import java.util.LinkedHashMap;

public class OccuranceOfChars {
	public static void main(String[] args) {
		String s="ASRanjith";
		LinkedHashMap<Character, Integer> lhp = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(lhp.containsKey(c)) {
				lhp.put(c, lhp.get(c)+1);
			}else {
				lhp.put(c, 1);
			}
		}
		System.out.println(lhp);
	}

}
