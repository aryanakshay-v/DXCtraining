package inbuilt.functionalInterface.functions;

import java.util.function.Function;

public class TestFunction {
	public static void main(String[] args) {
		Function<Integer,Integer> f = i-> i*i;
		System.out.println(f.apply(5));
		
		Function<String,Integer> f2 = s-> s.length();
		System.out.println("the lenghth of the string s is : "+f2.apply("akshay"));
		
		Function<String,String> f3 = s->s.toLowerCase();
		System.out.println(f3.apply("ARYAN AKSHAY"));
	}

}
