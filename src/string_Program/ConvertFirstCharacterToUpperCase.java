package string_Program;

public class ConvertFirstCharacterToUpperCase {
	public static void main(String[] args) {
		String s="welcome to admin world";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
			String s1=str[i];
			char firstWord=(char)(s1.charAt(0)-32);
			System.out.print(firstWord+s1.substring(1)+" ");
			//System.out.print(Character.toUpperCase(s1.charAt(0))+s1.substring(1)+" ");
		}
	}

}
