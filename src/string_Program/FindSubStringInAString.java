package string_Program;

public class FindSubStringInAString {
	public static void main(String[] args) {
		String s = "asdtektyutekotekteketektek";
		String sub = "tek"; // The substring to count

		int count = countOccurrences(s, sub);
		System.out.println(sub + " -> " + count + " times");
	}

	public static int countOccurrences(String str, String sub) {
		int count = 0, index = 0;

		while ((index = str.indexOf(sub, index)) != -1) {
			count++;
			index += sub.length(); // Move index forward
		}

		return count;
	}

}
