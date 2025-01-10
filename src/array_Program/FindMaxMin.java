package array_Program;

public class FindMaxMin {
	public static void main(String[] args) {
		int [] a= {9,5,6,2,7};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Maximum number in this array: "+max);
		System.out.println("Minimum number in this array: "+min);
	}

}
