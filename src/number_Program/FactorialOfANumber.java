package number_Program;

import java.util.Scanner;

public class FactorialOfANumber {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sca.nextInt();
		System.out.println(factorialOf(num));
		sca.close();
	}

	public static int factorialOf(int num) {
		int fact = 1;  //<-- it should be 1 because we are multiplying
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
