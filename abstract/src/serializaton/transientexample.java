package serializaton;

import java.io.Serializable;

public class transientexample implements Serializable {
	int id;
	String name;
	transient int age;
	public transientexample(int id, String name, int age) {
		this.id=id;
		this.age=age;
		this.name=name;
	}

}
