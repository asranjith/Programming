package lambdaExpression;

public class DriverI3 {
	public static void main(String[] args) {
		I3 i3 = (a,b)->{
			return a+b;
		};
		System.out.println(i3.add(1, 2));
	}

}
