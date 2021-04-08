package lamdaexpressions.collections;

public class Employee {
	
	String name;
	int id;
	public Employee(String string, int i) {
		
		name= string;
		id= i;
	}
	@Override
	public String toString() {
		return id + " - "+ name;
	}

}
