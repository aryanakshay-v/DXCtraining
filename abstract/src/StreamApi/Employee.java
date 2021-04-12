package StreamApi;

public class Employee {
	String name;
	int salary;
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", salary=" + salary + "]";
	}
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (this.salary>o.salary) ? 1 :(this.salary<o.salary) ? -1 : 0;
	};
	
	

}
