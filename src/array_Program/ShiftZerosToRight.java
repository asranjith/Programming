package array_Program;

import java.util.Arrays;

public class ShiftZerosToRight {
	public static void main(String[] args) {
		int[] a= {2,4,7,0,2,0,6,0};
		int[] res=new int[a.length];
		int first=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				res[first++]=a[i];
			}
			
		}
		System.out.println(Arrays.toString(res));
		
	}

}
