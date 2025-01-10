package number_Program;

import java.util.Scanner;

public class PrimeNumberWithInRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting number :");
		int start = sc.nextInt();
		System.out.println("Enter the ending number :");
		int end = sc.nextInt();
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
