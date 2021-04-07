package serializaton;
import java.io.*;

public class CustomerSerializationDemo {
	public static void main(String[] args) throws Exception {
		Account account = new Account();
		
		FileOutputStream fos = new FileOutputStream("account.txt");
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		oos.writeObject(account);
		
		FileInputStream fis = new FileInputStream("account.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account account2= (Account) ois.readObject();
		System.out.println("username = "+account2.username+" password= "+account2.password);
		
		
		
	}

}
