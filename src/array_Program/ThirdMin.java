package array_Program;

public class ThirdMin {
	public static void main(String[] args) {
		int[] a= {1,6,3,2,7};
		int min=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		int thirdMin=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				thirdMin=secondMin;
				secondMin=min;
				min=a[i];
			}else if(a[i]<secondMin && a[i]!=min) {
				thirdMin=secondMin;
				secondMin=a[i];
			}else if(a[i]<thirdMin && a[i]!=secondMin) {
				thirdMin=a[i];
			}
			
		}
		System.out.println("Third minimum in this array: "+thirdMin);
	}

}
