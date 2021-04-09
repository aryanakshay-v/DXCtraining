package inbuilt.functionalInterface.predicates;

import java.util.function.Predicate;

public class Chainpredicates {
	public static void main(String[] args) {
		Predicate<Integer> p1 = i-> i%2 ==0;
		Predicate<Integer> p2 = i-> i>=10;
		int[] Array = {10,20,30,5,4,3,2,1,70,80};
		System.out.println("if no > 10 and if it is even   print it");
		for (int i : Array) {
			if(p1.and(p2).test(i)) {
				System.out.println(i);
			}
		}

		System.out.println("if n >10 or if it is even then print it");

		for (int i : Array) {
			if(p1.or(p2).test(i)) {
				System.out.println(i);
			}
		}

	}

}
