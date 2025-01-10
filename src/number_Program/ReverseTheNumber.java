package number_Program;

public class ReverseTheNumber {
	public static void main(String[] args) {
		long num=9791633487l;
		long rev=0;
		while(num>0) {
			long rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}

}
