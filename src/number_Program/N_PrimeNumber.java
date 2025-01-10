package number_Program;

import java.util.Scanner;

public class N_PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of prime number to print :");
		int n = sc.nextInt();
		System.out.println("Prime number Starting from :");
		int number = sc.nextInt();
		int count=0;
		while(count < n) {
			if(isPrime(number)) {
				System.out.print(number+" ");
				count++;
			}
			number++;
		}
		sc.close();
	}
	
	   public static boolean isPrime(int num) {
	    	if(num<=1) {
	    		return false;
	    	}
	    	for(int i=2;i<=num/2;i++) {
	    		if(num%i==0) {
	    			return false;
	    		}
	    	}
	    	return true;
	    }	

}
