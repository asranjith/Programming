package collection;

import java.util.ArrayList;

public class AddElememtAtAnIndex {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("ERP");
		list.add("SCM");
		list.add("CRM");
		list.add("E-commerce");
		System.out.println(list);
		
		list.add(0,"HRMS");
		System.out.println(list);
	}

}
