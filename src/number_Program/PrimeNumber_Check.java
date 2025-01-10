package number_Program;

import java.util.Scanner;

public class PrimeNumber_Check {
    public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int number = sca.nextInt();
		if(isPrime(number)) {
			System.out.println("It is a prime number");
		}else {
			System.out.println("It is not a prime number");
		}
		sca.close();
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
