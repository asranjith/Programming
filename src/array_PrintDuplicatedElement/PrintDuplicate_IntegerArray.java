package array_PrintDuplicatedElement;

import java.util.Arrays;
import java.util.List;

public class PrintDuplicate_IntegerArray {
	public static void main(String[] args) {
		Integer[] a= {1,3,2,1,3,2,4,6,7};
		List<Integer> list = Arrays.asList(a);
		for(int i=0;i<list.size();i++) {
			Integer in = list.get(i);
			if(list.indexOf(in)!= list.lastIndexOf(in) && i==list.indexOf(in)) {
				System.out.print(in+" ");
			}
			
		}
	}

}
