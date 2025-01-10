package array_Program;

import java.util.HashSet;

public class TargetSum {
	public static void main(String[] args) {
		int[] a= {10,5,7,8,9,6,6,9,10,5};
		int targetSum=15;
		HashSet set = new HashSet();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==targetSum) {
					String res=a[i]>a[j]?"("+a[j]+","+a[i]+")":"("+a[i]+","+a[j]+")";
					set.add(res);
				}
				
			}
		}
		System.out.println(set);
	}

}
