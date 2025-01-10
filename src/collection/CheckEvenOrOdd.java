package collection;

import java.util.ArrayList;

public class CheckEvenOrOdd {
	public static void main(String[] args) {
		ArrayList<Object>list=new ArrayList<Object>();
		list.add(5);
		list.add(8);
		list.add(2);
		list.add(7);
		for (int i=0;i<list.size();i++) {
			int num=(Integer)list.get(i);
			if(num%2==0) {
				System.out.println(num);
			}
		}
	}

}
