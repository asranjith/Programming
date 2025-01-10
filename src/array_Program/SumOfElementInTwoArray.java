package array_Program;

import java.util.Arrays;

public class SumOfElementInTwoArray {
	public static void main(String[] args) {
		int[] a= {1,5,4,3};
		int[] b= {3,1,3,6,4};
		int maxLength= Math.max(a.length,b.length);
		int[] sum=new int[maxLength];
		for(int i=0;i<maxLength;i++) {
			if(i<a.length) {
				sum[i]+=a[i];
			}
			if(i<b.length) {
				sum[i]+=b[i];
			}
		}
		System.out.println(Arrays.toString(sum));
	}

}
