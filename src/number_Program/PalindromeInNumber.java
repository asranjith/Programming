package number_Program;

import java.util.Scanner;

public class PalindromeInNumber {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int x=n;
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==x) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}
		sc.close();
	}
}
