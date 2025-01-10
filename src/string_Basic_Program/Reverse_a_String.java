package string_Basic_Program;

public class Reverse_a_String {
	public static void main(String[] args) {
		String original = "Hello World";
		String reversed = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			reversed = reversed+original.charAt(i); // Append characters in reverse order
		}
		System.out.println(reversed);
	}
}
