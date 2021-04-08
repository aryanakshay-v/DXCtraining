package lamdaexpressions;

import java.util.function.Function;

public class FirstLamda {
	public static void main(String[] args) {
		Function<Integer,Integer> f= n -> n*n;
		System.out.println(f.apply(5));
		lSum f2 = (a,b) -> a+b;
		System.out.println("the sum is "+f2.add(15,5));
		FuncInterface f1 = () -> System.out.println("hellow world");
		f1.m1();
	}




}
