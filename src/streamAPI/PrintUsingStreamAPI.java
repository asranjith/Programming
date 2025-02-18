package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PrintUsingStreamAPI {
	public static void main(String[] args) {
		//printing the data using for each
		List<Integer> arr = Arrays.asList(4,5,7,8,9);
		arr.forEach(n->System.out.print(n+" "));
		System.out.println();
		
		// printing the data using stream
		
		Stream<Integer> data = arr.stream();
		long count = data.count();
	//	System.out.println(count);   // <- this will throw java.lang.IllegalStateException data stream is already been operated upon or closed
		data.forEach(n->System.out.print(n+" "));
		
		//This for each will throw java.lang.IllegalStateException because this data stream is already been operated upon or closed 
		
		data.forEach(n->System.out.print(n+" "));
		
	}

}
