package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class LearningListIterator {
	public static void main(String[] args) {
		ArrayList<Object>list=new ArrayList<Object>();
		list.add("selenium");
		list.add("Apache poi");
		list.add("TestNg");
		list.add("GitHub");
		list.add("Maven");
		
		ListIterator listItr = list.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		System.out.println("=========================");
		
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		System.out.println("==========================");
		
		ListIterator listItr1 = list.listIterator(4);
		System.out.println(listItr1.next());
		
		ListIterator listItr2 = list.listIterator(4);
		System.out.println(listItr2.previous());
	}

}
