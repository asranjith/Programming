package string_Program;

public class RemoveDuplicateWordsInASentence {
	public static void main(String[] args) {
		String s="good is good and bad is bad";
		String res="";
		String[] arr = s.split(" ");
		for(int i=0; i<arr.length; i++) {
			String word=arr[i];
			if(res.indexOf(word)==-1) {
				res+=word+" ";
			}
		}
		System.out.println(res);
		
	}

}
