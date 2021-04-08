package lamdaexpressions.collections;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.id < e2.id) return -1;
		else if (e1.id > e2.id) return 1;
		else return 0;
	}

}
