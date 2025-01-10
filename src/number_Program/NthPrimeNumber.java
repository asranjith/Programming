package number_Program;

import java.util.Scanner;

public class NthPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth prime number :");
		int n = sc.nextInt();
		int count=0;
		int number=2;
		while(count < n) {
			if(isPrime(number)) {
				count++;
				 if (count == n) {
	                    System.out.println("The " + n + "th prime number is: " + number);
	                    break;
	                }
			}
			number++;
			
		}
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
