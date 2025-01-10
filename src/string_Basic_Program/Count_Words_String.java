package string_Basic_Program;

public class Count_Words_String {
	
	 // - Input: "Java is awesome"
	  // - Output: Number of words: 3
	
   public static void main(String[] args) {
	 String s= " Java is awesome ";
	 String[] arr = s.trim().split("\\s+");
	 System.out.println(arr.length);
	 
  	   
}
}
