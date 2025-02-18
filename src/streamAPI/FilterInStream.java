package streamAPI;

import java.util.Arrays;
import java.util.List;

public class FilterInStream {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(10,7,2,8,9);
		arr.stream()
		      .filter(n->n%2==1)
		      .sorted()
              .map(n->n*2)
              .forEach(n->System.out.print(n+" "));
	}

}
