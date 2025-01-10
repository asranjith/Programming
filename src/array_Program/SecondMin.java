package array_Program;

public class SecondMin {
	public static void main(String[] args) {
		int[] a= {2,5,3,7,8};
		int min=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;

		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				secondMin=min;
				min=a[i];
			}else if(a[i]<secondMin && a[i]!=min) {
				secondMin=a[i];
			}
			
		}
		System.out.println(secondMin);
	}

}
