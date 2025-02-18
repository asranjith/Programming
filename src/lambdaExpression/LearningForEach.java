package lambdaExpression;



import java.util.Arrays;
import java.util.List;

public class LearningForEach {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("Sachin","Ganguly","Dravid");
		list.forEach((a)->{System.out.println(a);});
		
	}

}
