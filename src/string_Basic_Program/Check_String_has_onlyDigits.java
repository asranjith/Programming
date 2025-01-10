package string_Basic_Program;

public class Check_String_has_onlyDigits {
	   public static void main(String[] args) {
	        String input = "12345";
	        if (containsOnlyDigits(input)) {
	            System.out.println("\"" + input + "\""+" contains only digits");
	        } else {
	            System.out.println("\"" + input + "\""+" does not contain only digits");
	        }
	    }

	    public static boolean containsOnlyDigits(String input) {
	        // Check if the string contains only digits using a regular expression
	        return input.matches("\\d+");
	    }
}
