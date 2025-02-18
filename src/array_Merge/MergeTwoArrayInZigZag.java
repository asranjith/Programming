package array_Merge;

public class MergeTwoArrayInZigZag {
  public static void main(String[] args) {
	int a[]= {1,2,3};
	int b[]= {11,22,33,44};
	int length=a.length+b.length;
	int c[]=new int[length];
	int n=0;
	for(int i=0;i<length;i++) {
		if(i<a.length) {
			c[n]=a[i];
			n++;
		}
		if(i<b.length) {
		c[n]=b[i];
		n++;
		}
	}
	for(int i=0;i<length;i++) {
		System.out.print(c[i]+" ");
	}
}
}
