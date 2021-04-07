package serializaton;
import java.io.*;

public class SerializationInheritance {
	private static final String FILE_NAME = "inheritance.txt";
	
	public static void main(String[] args) throws Exception {
		Rabbit rabbit = new Rabbit();
		rabbit.i=231;
		rabbit.j=547;
		rabbit.k=354;
		FileOutputStream fos = new FileOutputStream(FILE_NAME);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(rabbit);
		
		FileInputStream fis = new FileInputStream(FILE_NAME);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Rabbit rabbit2 = (Rabbit)ois.readObject();
		
		System.out.println("rabbits variables i= "+rabbit2.i+" j="+rabbit2.j+" k="+rabbit2.k);
		
		
	}

}
