package lambdaExpression;

public class DriverI1 {
	public static void main(String[] args) {
		I1 i1=()-> System.out.println(2);
		i1.print();
		
		I1 i2=()->{
			System.out.println(2+2);
		};
		i2.print();
		
	}

}
