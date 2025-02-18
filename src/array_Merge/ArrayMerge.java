package array_Merge;

import java.util.Arrays;

public class ArrayMerge {
public static void main(String[] args) {
	char a[]= {'a','b','c'};
	int b[]= {1,2,3};
	char res[]=new char[a.length+b.length];
	for(int i=0;i<res.length;i++) {
		if(i%2==0) {
			res[i]=a[i/2];
		
		}
			else
			{
				char ch=(char)(b[i/2]+48);
				res[i]=ch;
				
			}
		}
	System.out.println(Arrays.toString(res));
   
}
}
