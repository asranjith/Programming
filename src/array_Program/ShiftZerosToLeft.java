package array_Program;

import java.util.Arrays;

public class ShiftZerosToLeft {
	public static void main(String[] args) {
		int[] a= {2,4,7,0,2,0,6,0};
		int[] res=new int[a.length];
		int index=res.length-1;
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]!=0) {
				res[index--]=a[i];
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
