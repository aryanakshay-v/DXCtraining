package serializaton;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deseializexample {
	public static void main(String[] args) throws Exception {
		ObjectInputStream in =  new ObjectInputStream(new FileInputStream("example.txt"));
		transientexample t = (transientexample)in.readObject();
		System.out.println(t.id+" "+t.name+" "+t.age);
		in.close();
		
		
	}

}
