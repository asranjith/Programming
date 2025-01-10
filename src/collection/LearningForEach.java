package collection;

import java.util.ArrayList;

public class LearningForEach {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("ASR");
		list.add("sekar");
		list.add("TamilSelvi");
		for (String ele : list) {
			System.out.println(ele);
			
		}
	}

}
