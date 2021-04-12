package StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;
import java.util.stream.Collectors;

public class PlayEmployees {
	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee("ARYAN",1234));
		emplist.add(new Employee("sanjay",3213));
		emplist.add(new Employee("rakesh",6541));
		emplist.add(new Employee("Navya",6546));
		emplist.add(new Employee("hello",8943));
		emplist.add(new Employee("akshay",1354));
		
		System.out.println(emplist);
		Comparator<Employee> c =(e1,e2) -> {
			return
					(e1.salary < e2.salary)? -1
					:(e1.salary > e2.salary)? +1
					:0;
		};
		List<Employee> sortedList = emplist.stream().sorted(c).collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		Employee[] employee = (Employee[]) sortedList.stream().toArray();
		
		
		/*Employee maxSalary =emplist.stream().max((e1,e2) -> e2.compareTo(e1)).get();
		//System.out.println(sortedList);
		System.out.println(maxSalary.toString());*/
		
		
		
		
	}

}
