package serializaton;

import java.io.*;

public class Reciver {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("wild.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Tiger tiger = (Tiger)ois.readObject();
		System.out.println("Tiger Variables are: "+ tiger.a);
		
	}

}
