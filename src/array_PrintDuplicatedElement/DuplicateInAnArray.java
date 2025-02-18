package array_PrintDuplicatedElement;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInAnArray {
  public static void main(String[] args) {
	int a[]= {1,4,6,8,1,3,4};
	Set<Integer> uniqueNumber = new HashSet<>();
	
	for(int i=0;i<a.length;i++) {
		if(uniqueNumber.contains(a[i])) {
			System.out.println("duplicate Element :"+a[i]);
		}
		else {
			uniqueNumber.add(a[i]);
		}
	}
	
	
}
}
