package inbuilt.functionalInterface.biparms;

import java.util.ArrayList;
import java.util.function.BiConsumer;

import inbuilt.functionalInterface.functions.JavaStudent;
import inbuilt.functionalInterface.functions.studenttest;

public class BiConsumerTest {
	public static void main(String[] args) {
		ArrayList<JavaStudent> javastudents = studenttest.populateStudents();
		BiConsumer<JavaStudent, Integer> bic = (j,i) -> j.marks +=10;
		
		for(JavaStudent j : javastudents) {
			bic.accept(j, 10);
			System.out.println(j.name+"\t"+j.marks);
		}
	}

}
