package string_Program;

public class SwapStringWithOutUsingThirdVariable {
	public static void main(String[] args) {
		String s1="AS";            
		String s2="Ranjith";
		 s1=s1+s2;               //ASRanjith
		s2=s1.substring(0,s1.length()-s2.length());   //now s2 length is 2
		s1=s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);
	}

}
