package collection;

import java.util.ArrayList;

public class CheckElementIspresentInList {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("USA");
		list.add("Canada");
		list.add("Russia");
		list.add("Ukraine");
		System.out.println(list.contains("Ukraine"));
		
		ArrayList<String>list1=new ArrayList<String>();
		list1.add("SriLanka");
		list1.add("China");
		list1.add("Africa");
		System.out.println(list.containsAll(list1));
		System.out.println(list1.indexOf("china"));
	}

}
