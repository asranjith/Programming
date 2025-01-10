package number_Program;

import java.util.Scanner;

public class Fibonacci_Series {
	
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sca.nextInt();
		int first = 0, second = 1;
		for (int i = 0; i <= num; i++) {
			System.out.print(first +" ");
			int third = first + second;
			first = second;
			second = third;
		}
		sca.close();

	}
}
