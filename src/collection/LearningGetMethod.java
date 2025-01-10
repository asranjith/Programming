package collection;

import java.util.ArrayList;

public class LearningGetMethod {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Puliyogre");
		list.add("Tomato Rice");
		list.add("Palav");
		list.add("Dal rice");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
