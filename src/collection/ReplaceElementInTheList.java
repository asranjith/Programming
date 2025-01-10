package collection;

import java.util.ArrayList;

public class ReplaceElementInTheList {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Eat");
		list.add("Sleep");
		list.add("Repeat");
		
		System.out.println(list);
	    list.set(0, "I ate");
		System.out.println(list);
	}

}
