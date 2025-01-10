package string_Program;

public class GenerateAllSubstring {
	public static void main(String[] args) {
		String s="sum";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {   // j<=s.length() is due to substring do not consider last index
				System.out.print(s.substring(i,j)+" ");
				
			}
			
		}
	}

}
