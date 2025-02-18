package lambdaExpression;

public class DriverI2 {
	public static void main(String[] args) {
		I2 i2=(a,b)->{
			System.out.println(a+b);
		};
		i2.add(5,2);
	}
	

}
