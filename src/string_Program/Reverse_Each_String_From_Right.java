package string_Program;

import java.util.Scanner;

public class Reverse_Each_String_From_Right {
   
public static void main(String[] args) {
	 Scanner sca = new Scanner(System.in);
	 System.out.println("Enter the sentence :");
	 String sentence = sca.nextLine();
	 String[] s = sentence.split("\\s+");
	   String rev = "";
       for (int i = 0;i<s.length;i++) {
           for (int j=s[i].length()-1;j>=0;j--) {
               rev += s[i].charAt(j);
               
           }
           rev = rev+" ";
       }
       System.out.println(rev);
       sca.close();

	 
}
}
