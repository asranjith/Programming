package collection;

import java.util.ArrayList;

public class AddingListAtAnList {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("MasterChef");
		list.add("SaReGaMaPa");
		list.add("DKD");
		list.add("KBC");
		
		ArrayList<String>list1=new ArrayList<String>();
		list1.add("SanjeevKapoor");
		list1.add("Anushree");
		list1.add("Anand");
		list1.add("Appu");
		list.addAll(4,list1);
		System.out.println(list);
	}

}
