package string_Program;

import java.util.ArrayList;

public class PrintUniqueString {
	public static void main(String[] args) {
		String s="good is good and bad is bad";
		String[] arr = s.split(" ");
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		for(String word:list) {
			if(list.indexOf(word)== list.lastIndexOf(word)) {
				System.out.print(word);
			}
		}
	}

}
