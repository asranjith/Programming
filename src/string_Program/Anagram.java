package string_Program;

public class Anagram {
	public static void main(String[] args) {
		String str1 = "Listen";
		String str2 = "Silent";
		if (isAnagram(str1, str2)) {
			System.out.println("It is an anagram");
		} else {
			System.out.println("It is not an anagram");
		}
	}

	public static boolean isAnagram(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if (s1.length() == s2.length()) {
			String s1Sorted = sortString(s1);
			String s2Sorted = sortString(s2);
			return s1Sorted.equals(s2Sorted);
		}
		return false;
	}

	public static String sortString(String s) {
		char[] chararr = s.toCharArray();
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (chararr[i] > chararr[j]) {
					char temp = chararr[i];
					chararr[i] = chararr[j];
					chararr[j] = temp;
				}
			}
		}
		return new String(chararr);  //convert the sorted character array back into a String
	}
}
