package collection;

import java.util.ArrayList;

public class CombiningTwoLists {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("PHP");
		list.add("Java");
		list.add("SQL");
		list.add("Js");
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Selenium");
		list1.add("API");
		list1.add("C#");
		list1.add("RestAssured");
		list.addAll(list1);
		System.out.println(list);
	}

}
