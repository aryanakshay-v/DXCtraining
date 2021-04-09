package inbuilt.functionalInterface.functions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerTest {
	static ArrayList<JavaStudent> javastudents = studenttest.populateStudents();
	public static void main(String[] args) {
		Consumer<JavaStudent> c = s -> System.out.println(s.name);
	
		for(JavaStudent student  : javastudents) {
			c.accept(student);
		}
	}
	

}
