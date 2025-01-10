package collection;

import java.util.ArrayList;

public class RemoveAnElementFromList {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("mockyto");
		list.add("Selenium");
		list.add("TestNg");
		list.add("PostMan");
		System.out.println(list);
		list.remove("PostMan");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}

}
