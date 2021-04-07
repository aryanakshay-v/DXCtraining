package serializaton;
import java.io.*;

public class Sender {
	public static void main(String[] args) throws IOException {
		Tiger tiger = new Tiger();
		FileOutputStream fos = new FileOutputStream("wild.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(tiger);
	}

}
