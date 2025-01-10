package string_Program;

import java.util.ArrayList;

public class BalancedString {
	public static void main(String[] args) {
		String s="{}[]()}";
		ArrayList<Character>list = new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(list.size()>0 && ((ch==')' && list.get(list.size()-1)=='(')
					             ||(ch==']' && list.get(list.size()-1)=='[')
					              ||(ch=='}'&& list.get(list.size()-1)=='{'))) {
				list.remove(list.get(list.size()-1));
				
			}else {
				list.add(ch);
			}
		}
		if(list.isEmpty()) {
			System.out.println("String is balanced");
		}else {
			System.out.println("String is not balanced");
		}
	}

}
