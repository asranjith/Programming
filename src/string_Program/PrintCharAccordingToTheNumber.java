package string_Program;

public class PrintCharAccordingToTheNumber {
	public static void main(String[] args) {
		String s="a2b2a1b1c1";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(i%2!=0 && (ch>='0' && ch<='9') ) {
				for(int j=0;j<ch-'0';j++) {
					System.out.print(s.charAt(i-1));
				}
			}
		}
	}

}
