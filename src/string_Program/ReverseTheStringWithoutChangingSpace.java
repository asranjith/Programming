package string_Program;

public class ReverseTheStringWithoutChangingSpace {
	public static void main(String[] args) {
		String s="World on fire";
		String spaceRemoved = s.replace(" ", "");
		int last=spaceRemoved.length()-1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				System.out.print(s.charAt(i));
			}else {
				System.out.print(spaceRemoved.charAt(last--));
			}
		}
	}

}
