package inbuilt.functionalInterface.functions;

import java.util.ArrayList;
import java.util.function.Function;

public class studenttest {
	static ArrayList<JavaStudent> javastudents;
	public static void main(String[] args) {
		populateStudents();
		Function<JavaStudent,String> f = (j) -> {
			if(j.marks>80) return  "Distinctoin";
			else if(j.marks>60) return "1st class";
			return "pass";
		};
		for (JavaStudent s : javastudents) {
			System.out.println(s.name + "\t"+ f.apply(s));
		}
		
	}
	public static ArrayList<JavaStudent> populateStudents() {
		// TODO Auto-generated method stub
		javastudents = new ArrayList<JavaStudent>();
		javastudents.add(new JavaStudent("aryan", 50));
		javastudents.add(new JavaStudent("akshay", 82));
		javastudents.add(new JavaStudent("verdu", 90));
		javastudents.add(new JavaStudent("sanjay", 65));
		javastudents.add(new JavaStudent("mani", 72));
		return javastudents;
		
		
		
	}
	

}
