package inbuilt.functionalInterface.biparms;

import java.util.function.BiFunction;

import inbuilt.functionalInterface.Employee1;

public class TestBiFunction {
	public static void main(String[] args) {
		
		BiFunction< Integer, String, Employee1> bif =(i,s) -> new Employee1(s, i);

		Employee1 employee = bif.apply(547, "Aryan Akshay");
		
		System.out.println(employee.name);
	}

}
