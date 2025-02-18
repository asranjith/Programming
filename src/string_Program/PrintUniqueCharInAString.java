package string_Program;

public class PrintUniqueCharInAString {
	public static void main(String[] args) {
		String s="java";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(s.indexOf(ch)==s.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}

}
