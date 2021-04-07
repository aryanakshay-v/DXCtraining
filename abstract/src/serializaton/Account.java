package serializaton;
import java.io.*;

public class Account implements Serializable{
	String username ="Aryan Akshay";
	transient String password ="hellojava";
	
	private void writeObject(ObjectOutputStream oos) throws ClassNotFoundException,IOException{
		oos.writeUTF("123"+ username + ","+ "456" + password);
	}
	private void readObject(ObjectInputStream ois) throws IOException {
		String[] Pwd = ois.readUTF().split(",");
		this.username = Pwd[0].substring(3);
		this.password = Pwd[1].substring(3);
		
	}

}
