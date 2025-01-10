package collection;

import java.util.ArrayList;

public class PracticeProgram {
	public static void main(String[] args) {
		int price=0;
		ArrayList<Object> list=new ArrayList<Object>();
		list.add("Puliyogre");
		list.add("Tomato Rice");
		list.add("Palav");
		list.add("Dal rice");
		for(int i=0;i<list.size();i++) {
			price+=10;
		String ele = (String)list.get(i);
		System.out.println(ele+" -"+price);
		}
	}

}
