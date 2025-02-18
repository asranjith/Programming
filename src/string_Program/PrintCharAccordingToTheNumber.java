package string_Program;

public class PrintCharAccordingToTheNumber {
	public static void main(String[] args) {
		String s="a2b2a1b1c1";
		for(int i=0;i<s.length();i+=2) {
			char ch = s.charAt(i);
			int count=s.charAt(i+1)-'0';
				for(int j=0;j<count;j++) {
					System.out.print(ch);
				}
			
		}
	}

}
