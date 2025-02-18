package number_Program;

import java.util.ArrayList;
import java.util.List;

public class SortTheArrayAndRemoveDuplicate {
	//we can directly go for tree set to sort and unique element
	public static void main(String[] args) {
		int[] a = { 3, 4, 2, 5, 3, 5, 8 };
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int x = 0; x < a.length; x++) {
			Integer in = a[x];
			if (list.indexOf(in) == -1) {
				list.add(in);
				System.out.print(in + ", ");
			}
		}
		System.out.println();
		System.out.println(list);

	}

}
