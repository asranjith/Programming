package reverseTheString;

public class ReverseEachWord {
	public static void main(String[] args) {
		String s="Welcome to the programming world";
		String[] word = s.split(" ");
		for(int i=0;i<word.length;i++) {
			String s1 = word[i];
			StringBuilder builder = new StringBuilder(s1);
			System.out.print(builder.reverse()+" ");
		}
	}

}
