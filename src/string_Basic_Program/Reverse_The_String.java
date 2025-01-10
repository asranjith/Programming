package string_Basic_Program;

public class Reverse_The_String {
     // - Input: "hello"
	 //  - Output: "olleh"
	
	 public static void main(String[] args) {
	        String input = "hello";
	        String output = reverseString(input);
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + output);
	    }

	    public static String reverseString(String input) {
	        char[] chars = input.toCharArray();
	        String reversed = "";
	        for (int i = chars.length - 1; i >= 0; i--) {
	            reversed += chars[i];
	        }
	        return reversed;
	    }
	 
}
