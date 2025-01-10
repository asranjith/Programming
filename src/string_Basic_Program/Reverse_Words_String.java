package string_Basic_Program;

public class Reverse_Words_String {
	
    //- Input: "hello world"
	// - Output: "world hello"
	
	public static void main(String[] args) {
		System.out.println(reverseWords("hello world"));
	}
	   public static String reverseWords(String input) {
	        String[] words = input.split(" ");
	        StringBuilder reversed = new StringBuilder();
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversed.append(words[i]);
	            if (i != 0) {
	                reversed.append(" ");    //to add space until, it is a last word
	            }
	        }
	        return reversed.toString();
	    }
}
