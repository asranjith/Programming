package string_Program;

public class SubStringMoreThanLengthone {
	public static void main(String[] args) {
		String s="asr";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String s1 = s.substring(i,j);
				if(s1.length()>1) {
					System.out.print(s1+" ");
				}
				
			}
			
		}
	}

}
