package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class LearningIterator {
	public static void main(String[] args) {
		ArrayList<Object>list=new ArrayList<Object>();
		list.add("selenium");
		list.add("Apache poi");
		list.add("TestNg");
		list.add("GitHub");
		list.add("Maven");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}


