package lambdaExpression;

import java.util.ArrayList;
import java.util.Comparator;

public class ListOfCar {
	public static void main(String[] args) {
		ArrayList<Car> list=new ArrayList<Car>();
		list.add(new Car("swift",800000));
		list.add(new Car("Duster",1200000));
		list.add(new Car("city",1500000));
		list.add(new Car("Nano",200000));
		System.out.println(list);
	/**	1.if we are giving implementation for compare method by using lambda expression we can give multiple implementation with in the class
		2.we can use lambda expression only for functional interface.
		3.() denotes the single abstract method in the interface, -> is a lambda expression.
		4.we are giving implementation for compare abstract method in comparator by using lambda expression
		5.implementation of one method can be given as input to another method**/
		list.sort((o1,o2)->{
			Car c1=(Car)o1;
			Car c2=(Car)o2;
			if(c1.price==c2.price) {
				return 0;                        //implementation 1
			}else if(c1.price>c2.price){
				return 1;
			}else
				return -1;
		});
		
		System.out.println(list);
		
		list.sort((o1,o2)->{
			Car c1=(Car)o1;
			Car c2=(Car)o2;
			return c1.name.compareTo(c2.name);   //implementation 2
		});
		System.out.println(list);
	}

}
