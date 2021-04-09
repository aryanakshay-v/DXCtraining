package inbuilt.functionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

import lamdaexpressions.collections.Employee;

public class Testpredicate {
	
	static public ArrayList<Employee1> employees;
	
	public static void main(String[] args) {
		/*Predicate<Integer> p = i -> i%2==0;
		System.out.println(p.test(10));*/
		populateEmployees();
		Predicate<Employee1> p1= (e) -> e.salary>= 10000;
		
		for(Employee1 e : employees) {
			if(p1.test(e)) {
				System.out.println(e.name);
			}
		}
		
	}

	private static void populateEmployees() {
		
		employees= new ArrayList<Employee1>();
		
		employees.add(new Employee1("aryan",2313));
		employees.add(new Employee1("akshay",50665));
		employees.add(new Employee1("verdu",62059));
		employees.add(new Employee1("sanjay",40236));
		employees.add(new Employee1("ramesh",7823));
		
		// TODO Auto-generated method stub
		
	}

}
