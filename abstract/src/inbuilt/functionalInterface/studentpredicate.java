package inbuilt.functionalInterface;

import java.util.*;
import java.util.function.Predicate;

public class studentpredicate {
	static public ArrayList<Student> students;
	public static void main(String[] args) {
		populateStudents(); 
		Predicate<Student> stu = (s) -> (s.m1+s.m2+s.m3)/3 >= 60;
		for(Student s : students) {
			 
				System.out.println(s.name+ "is " + ( stu.test(s) ? "Passed":"Failed"));
			
		}
	}

	private static void populateStudents() {
		students = new ArrayList<Student>();
		
		students.add(new Student("Akshay", 75, 60, 50));
		students.add(new Student("ARyan",5, 60, 50));
		students.add(new Student("Sanjay",7, 66, 54));
		students.add(new Student("Bose",65, 90, 35));
		
		
	}

}
