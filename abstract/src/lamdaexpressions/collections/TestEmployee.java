package lamdaexpressions.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("aryan",2313));
		al.add(new Employee("akshay",5665));
		al.add(new Employee("verdu",6259));
		al.add(new Employee("sanjay",4236));
		al.add(new Employee("ramesh",7823));
		
		System.out.println(al);
		
		Comparator<Employee> c = (e1,e2) -> (e1.id < e2.id)? -1 :(e1.id > e2.id)? 1 :0;
		Comparator<Employee> n = (e1,e2) -> (e1.name.compareTo( e2.name));
		Collections.sort(al,n);
		
		System.out.println(al);
		
		
	}

}
