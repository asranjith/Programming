package string_Basic_Program;

public class Replace_Space {
	//   - Input: "hello world"
	//	 - Output: "hello%20world"
	public static void main(String[] args) {
		String s="hello world";
		String replaced_word = s.replace(" ", "%20");
		System.out.println(replaced_word);
	}
}
