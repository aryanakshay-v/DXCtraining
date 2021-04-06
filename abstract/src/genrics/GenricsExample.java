package genrics;

import java.util.*;

public class GenricsExample {
	public static void main(String[] args) {
		String[] students=new String[3];
		students[0] ="aryan";
		//students[1]=5;throws a error
		students[1]="verdu";
		
		String name = students[0];
		
		
		ArrayList<String> studentsList = new ArrayList<String>();
		studentsList.add("akshay");
		//studentsList.add(new Integer(10));
		List<String> students1 = new LinkedList<String>();
		//students1.add = "rakesh";
		
		System.out.println(studentsList);
		
		String name1 = (String) studentsList.get(1);
		System.out.println(name1);
		
	}

}
