package string_Program;

import java.util.ArrayList;

public class PrintDuplicateString {

	public static void main(String[] args) {
		String s="good is good and bad is bad";
		String[] arr = s.split(" ");
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		for(int i=0;i<list.size();i++) {
			if(list.indexOf(list.get(i))!= list.lastIndexOf(list.get(i)) && i==list.indexOf(list.get(i))) {
				System.out.println(list.get(i));
			}
		}

	}

}
