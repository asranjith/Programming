package lambdaExpression;

import java.util.HashMap;
import java.util.Map;

public class LearningBiConsumer {
	public static void main(String[] args) {
		Map<String,Integer> hs = new HashMap<String,Integer>();
		hs.put("Dhoni", 7);
		hs.put("Rohit", 45);
		hs.put("Virat", 18);
		hs.forEach((key,value)->{System.out.println(key+"-"+value);});
	}

}
