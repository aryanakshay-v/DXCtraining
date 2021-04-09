package inbuilt.functionalInterface.functions;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerTest {
	static ArrayList<JavaStudent> javastudents = studenttest.populateStudents();
	public static void main(String[] args) {
		Predicate<JavaStudent> p = s-> s.marks >=60;

		Consumer<JavaStudent> c = s -> System.out.println(s.name);

		System.out.println("Marks above 60 ");
		for(JavaStudent student  : javastudents) {
			if(p.test(student)) {
				c.accept(student);
			}
		}
	}


}
