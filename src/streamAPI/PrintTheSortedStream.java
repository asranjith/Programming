package streamAPI;

import java.util.Arrays;
import java.util.List;

public class PrintTheSortedStream {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(10,3,5,8,9);
		
		arr.stream()
		      .sorted()
              .forEach(n->System.out.print(n+" "));
	}

}
