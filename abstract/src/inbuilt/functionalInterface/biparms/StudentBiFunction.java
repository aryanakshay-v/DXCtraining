package inbuilt.functionalInterface.biparms;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class StudentBiFunction {
	
	public static void main(String[] args) {
		
		BiFunction<Integer , Integer, Student> bif = (m,a) -> new Student("Aryan", m, a);
		
		Student student = bif.apply(18, 75);
		
		BiPredicate<Integer, Integer>bip1 = (age, marks) ->(age > 18);
		
		BiPredicate<Integer, Integer>bip2 = (age, marks) ->(marks >= 60);
		
		if(bip1.and(bip2).test(student.age,student.marks) ) {
			
			System.out.println(student.name+" iselgible");
		}
		else
			System.out.println(student.name+" is not elgible");
		
	}

}
