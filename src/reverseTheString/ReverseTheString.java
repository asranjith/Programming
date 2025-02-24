package reverseTheString;

import java.util.Scanner;

public class ReverseTheString {
  public static void main(String[] args) {
	  Scanner sca=new Scanner(System.in);
		System.out.println("Enter the String Value");
		String s=sca.nextLine();
		//System.out.println(new StringBuffer(s).reverse());
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev=rev+ch;
			
		}
		System.out.println(rev);
		
}
}
