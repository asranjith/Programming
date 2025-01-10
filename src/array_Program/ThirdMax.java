package array_Program;

public class ThirdMax {
	public static void main(String[] args) {
		int[] a= {1,6,3,2,7,4};
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		int thirdMax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				thirdMax=secondMax;
				secondMax=max;
				max=a[i];
			}else if(a[i]>secondMax && a[i]!=max) {
				thirdMax=secondMax;
				secondMax=a[i];
			}else if(a[i]>thirdMax && a[i]!=secondMax) {
				thirdMax=a[i];
			}
		}
		System.out.println("Third maximum in this array: "+thirdMax);
	}

}
