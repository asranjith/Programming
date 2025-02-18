package array_Program;

import java.util.Arrays;

public class RemoveDuplicateInAnArray {
	public static void main(String[] args) {
		int [] a= {4,7,9,3,7,1,4,9};
		Arrays.sort(a);
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				a[j++]=a[i];
			}
		}
		a[j++]=a[a.length-1];
		
		
		int [] result=Arrays.copyOf(a, j);     //copying the element and storing in separate array
		System.out.println(Arrays.toString(result));
		
		        //(or)
		
		for(int k=0;k<j;k++) {
			System.out.print(a[k]+", ");             
		}
	  }
	

}
