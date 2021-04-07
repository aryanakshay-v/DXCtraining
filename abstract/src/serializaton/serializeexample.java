package serializaton;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serializeexample {
	public static void main(String[] args) throws Exception {
		transientexample t1 = new transientexample(47, "Aryan", 21);
		
		
		FileOutputStream fos = new FileOutputStream("example.txt");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(t1);
		out.flush();
		
		out.close();
		fos.close();
		System.out.println("success");
		
	}

}
