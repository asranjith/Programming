package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PrintTheDataMultipliedBy2 {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(10,7,5,8,9);
		Stream<Integer> data = arr.stream();
		Stream<Integer> mappedData = data.map(n->n*2);
		mappedData.forEach(n->System.out.print(n+" "));
		System.out.println();
		        
		           //(or)
		
		arr.stream().map(n->n*2).forEach(n->System.out.print(n+" "));
		System.out.println();
		
		          //(or)  
		
		arr.stream()
		          .map(n->n*2)
		          .forEach(n->System.out.print(n+" "));
	}

}
