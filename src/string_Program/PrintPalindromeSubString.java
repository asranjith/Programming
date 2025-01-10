package string_Program;

public class PrintPalindromeSubString {
	public static void main(String[] args) {
		String s="asranjith";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String s1 = s.substring(i,j);
				if(isPalindrome(s1)) {
					System.out.print(s1+" ");
				}
				
			}
			
		}
	}
	public static boolean isPalindrome(String s) {
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
			
		}
		return true;
	  }
		
	}


