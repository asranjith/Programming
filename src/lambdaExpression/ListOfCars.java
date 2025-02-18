package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListOfCars {
	public static void main(String[] args) {
		ArrayList<Cars> list=new ArrayList<Cars>();
		list.add(new Cars("Swift",800000));
		list.add(new Cars("Duster",1200000));
		list.add(new Cars("City",1500000));
		list.add(new Cars("Nano",200000));
		System.out.println(list);
	/**if we want to sort the object, the object should implements Comparable and should have overriden the compareTo method
		because Collections.sort() accepts Comparable type, There no need to give condition to compare for String(only for String) type
		because String(Class) already implements Comparable / compateTo method accepts single argument**/
		Collections.sort(list); //--> this sort method sort the element according to the implementation given in cars class
		System.out.println(list);
		
		 // list.sort((a,b)->Double.compare(a.getPrice(), b.getPrice()));	
		 // list.sort((a,b)->a.getName().compareTo(b.getName()));
		 
		
		
		
     Comparator<Cars> c=(Cars c1,Cars c2)->{ return (int) (c2.price-c1.price); };
     Collections.sort(list,c);
     
		System.out.println(list);  //since we over ride toString method we can directly print the list variable
		    //(or)
		 for(Cars ele:list) {
			System.out.println(ele);
		}
	}

}
