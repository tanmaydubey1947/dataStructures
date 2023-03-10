package lambdaStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressionBean {
	
	public static void main(String[] args) {
		
		
		
		LambdaExpressionInteface i = (a,b)->{return a+b;};
			
		System.out.println(i.sum(5, 10));
		
		
		List<Integer>arrayInteger = Arrays.asList(1,2,3,4,5);
		
		System.out.println(arrayInteger.stream().filter(x -> x > 1).collect(Collectors.toList()));
		
		arrayInteger.stream().filter(e -> e%2==1).map(e -> e*e).collect(Collectors.toList());
	}
	

}
