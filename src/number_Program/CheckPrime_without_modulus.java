package number_Program;

public class CheckPrime_without_modulus {
	public static void main(String[] args) {
		
		int number=6;
		String result1=(((number/2)*2)==number)? "Even":"Odd";
		System.out.println("The number "+number+" is "+result1);
		
		String result2=((number & 1)==0)? "Even":"Odd";
		System.out.println("The number "+number+" is "+result2);
		
		String result3=((number % 2)==0)? "Even":"Odd";
		System.out.println("The number "+number+" is "+result3);
	}

}
